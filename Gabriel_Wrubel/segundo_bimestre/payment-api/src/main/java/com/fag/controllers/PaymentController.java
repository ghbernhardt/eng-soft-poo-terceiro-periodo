package com.fag.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/payment-api/v1")
public class PaymentController {

    @GET
    @Path("/testeget")
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return "Sou metodo get";
    }

    @POST
    @Path("/testepost")
    @Produces(MediaType.TEXT_PLAIN)
    public String post(){
        return "Sou metodo post";
    }
}
