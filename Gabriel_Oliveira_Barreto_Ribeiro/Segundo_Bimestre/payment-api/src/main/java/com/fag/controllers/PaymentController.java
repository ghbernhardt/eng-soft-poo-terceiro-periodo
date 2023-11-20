package com.fag.controllers;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fag.dto.TokenDTO;
import com.fag.service.RestClientCelcoin;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;

@Path("/payment-api/v1")
public class PaymentController {

    @Inject
    @RestClient
    RestClientCelcoin rest;

    @GET
    @Path("/token")
    @Produces(MediaType.TEXT_PLAIN)
    public TokenDTO hello(){
        Form form = new Form();
        form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");  
        form.param("grant_type", "client_credentials");
        form.param("client_secret", "null");

        return rest.genToken(form);
    }
}
