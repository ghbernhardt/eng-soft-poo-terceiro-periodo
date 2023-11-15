package com.fag.controllers;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fag.services.RestClientCelcoin;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/v1/payment-api")
public class PaymentController {

    @Inject
    @RestClient
    RestClientCelcoin rest;

    @GET
    @Path("/token")
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return rest.getString();
    }

    @POST
    @Path("/testepost")
    @Produces(MediaType.TEXT_PLAIN)
    public String post() {
        return "Teste método POST";
    }
}