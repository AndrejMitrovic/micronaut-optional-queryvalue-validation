package com.example;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
public class DemoTest {

    @Inject
    SampleClient sampleClient;

    @Test
    void testItWorks() {
        Assertions.assertFalse(sampleClient.optionalIsPresent());
    }

}
