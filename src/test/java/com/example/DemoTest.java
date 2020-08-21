package com.example;

import io.micronaut.http.client.exceptions.HttpClientResponseException;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.time.LocalDate;
import java.util.Optional;

@MicronautTest
public class DemoTest {

    @Inject
    SampleClient sampleClient;

    @Test
    void optionalQueryValueWithValidation() {
        Assertions.assertEquals(-1, sampleClient.optionalQueryValueWithValidation());
    }

    @Test
    void optionalQueryValueWithFormat_withBadFormat() {
        var thrown = Assertions.assertThrows(HttpClientResponseException.class, () -> sampleClient.optionalQueryValueWithFormat("sfdsfdd"));
        Assertions.assertEquals("Failed to convert argument [date] for value [sfdsfdd] due to: Text 'sfdsfdd' could not be parsed at index 0", thrown.getMessage());
    }

    @Test
    void queryValueWithFormat_withBadFormat() {
        var thrown = Assertions.assertThrows(HttpClientResponseException.class, () -> sampleClient.queryValueWithFormat("sfdsfdd"));
        Assertions.assertEquals("Failed to convert argument [date] for value [sfdsfdd] due to: Text 'sfdsfdd' could not be parsed at index 0", thrown.getMessage());
    }
}
