package com.wf.ecm.resume.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecm-rangers")
public class ECMRasumeController {

    @GetMapping("/get")
    public String getSampleData() {
        return "welcome to ECM Rangers..... ;)";
    }
}
