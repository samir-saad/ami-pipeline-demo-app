package org.ssaad.ami.pipeline.demo.api;

import org.ssaad.ami.pipeline.demo.dto.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;


@RestController
@RequestMapping("api/v1/hello")
public class HelloWorldController {

    private final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        logger.info("Greeting {}", name);
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}