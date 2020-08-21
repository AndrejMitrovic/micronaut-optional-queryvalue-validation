package com.example;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client(value = "/")
public interface SampleClient {
    @Get("/optionalIsPresent")
    public boolean optionalIsPresent();
}