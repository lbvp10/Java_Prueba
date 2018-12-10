package com.elmed.gzip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller("/gzip")
public class GzipController {

    @PostMapping(value = "/comprimir")
    public void comprimir(@RequestBody String data){

    }
}
