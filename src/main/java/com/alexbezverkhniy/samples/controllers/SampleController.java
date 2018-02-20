package com.alexbezverkhniy.samples.controllers;

import com.alexbezverkhniy.samples.services.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Alex Bezverkhniy on 2/1/18.
 */
@RestController
@RequestMapping(value = "/api/sample")
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting() {
        return sampleService.getGreetingMessage();
    }
}
