package com.alexbezverkhniy.samples.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Basic integration test for MVC Spring App
 *
 * Created by Alex Bezverkhniy on 2/1/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingTest() {
        String expected = "Hello Alex!";
        String actual = restTemplate.getForEntity("/api/sample/greeting", String.class).getBody();
    }
}
