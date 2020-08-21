package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.validation.Validated;

import javax.validation.constraints.Min;
import java.util.Optional;

@Controller
@Validated
public class SampleController {
    @Get("/optionalIsPresent")
    public boolean optionalIsPresent(@QueryValue @Min(1) Optional<Integer> limit) {
        return limit.isPresent();
    }
}
