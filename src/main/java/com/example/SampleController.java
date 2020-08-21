package com.example;

import io.micronaut.core.convert.format.Format;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.validation.Validated;

import javax.validation.constraints.Min;
import java.time.LocalDate;
import java.util.Optional;

@Controller
@Validated
public class SampleController {
    @Get("/optionalQueryValueWithValidation")
    public Integer optionalQueryValueWithValidation(@QueryValue @Min(1) Optional<Integer> limit) {
        return limit.orElse(-1);
    }

    @Get("/optionalQueryValueWithFormat")
    public String optionalQueryValueWithFormat(@QueryValue @Format("yyyy-MM-dd") Optional<LocalDate> date) {
        return date.map(LocalDate::toString).orElse("empty");
    }

    @Get("/queryValueWithFormat")
    public String queryValueWithFormat(@QueryValue @Format("yyyy-MM-dd") LocalDate date) {
        return date.toString();
    }
}
