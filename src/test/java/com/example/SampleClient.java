package com.example;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.http.client.annotation.Client;

@Client(value = "/")
public interface SampleClient {
    @Get("/optionalQueryValueWithValidation")
    Integer optionalQueryValueWithValidation();

    @Get("/optionalQueryValueWithFormat")
    String optionalQueryValueWithFormat(@QueryValue String date);

    @Get("/queryValueWithFormat")
    String queryValueWithFormat(@QueryValue String date);
}