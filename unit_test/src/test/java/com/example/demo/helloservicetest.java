package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloServiceTest {

    private final HelloService helloService = new HelloService();

    @Test
    void testGetHelloMessage() {
        String message = helloService.getHelloMessage();
        assertThat(message).isEqualTo("Hello, World!");
    }
}
