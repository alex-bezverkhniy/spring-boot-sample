package com.alexbezverkhniy.samples.services;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Basic Unit test for service.
 *
 * Created by Alex Bezverkhniy on 2/1/18.
 */
public class SampleServiceTest {

    private SampleService service;

    @Before
    public void before() {
        service = new SampleService();
    }

    @Test
    public void getGreetingMessageShouldReturnMessage() {
        service.name = "Alex";

        String expected = "Hello Alex!";
        String actual = service.getGreetingMessage();

        assertEquals(expected, actual);
    }
}
