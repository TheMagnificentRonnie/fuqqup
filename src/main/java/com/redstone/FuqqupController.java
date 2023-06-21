package com.redstone;

import io.micronaut.http.annotation.*;

@Controller("/fuqqup")
public class FuqqupController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}