package com.fag.services;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@RegisterRestClient(baseUri = "https://mocki.io")
public interface RestClientCelcoin {
    
    @GET
    @Path("/v1/8d827826-29bc-4fe7-b5dc-219752470d4c")
    String getString();
}
