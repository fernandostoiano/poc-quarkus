package com.fernandos.service;

import io.vertx.ext.web.common.template.test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloServiceTest {

    private HelloService helloService;

    @BeforeEach
    public void setUp() {
        this.helloService = new HelloService();
    }

    @Test
    public void shouldGetName() {

        String name = "Jonas Brother";

        String returned = helloService.getName(name);

        assertEquals("hello Jonas Brother", returned);
    }

}
