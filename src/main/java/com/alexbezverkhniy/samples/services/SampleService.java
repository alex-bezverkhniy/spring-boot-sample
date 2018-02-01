package com.alexbezverkhniy.samples.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Alex Bezverkhniy on 2/1/18.
 */
@Component
public class SampleService {

    @Value("${name:World}")
    protected String name;

    public String getGreetingMessage() {
        return String.format("Hello %s!", name);
    }
}
