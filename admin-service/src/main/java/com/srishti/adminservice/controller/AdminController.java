package com.srishti.adminservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/admin")
public class AdminController {

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public String createAdmin() {
        return "object created";
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getCustomerAccount() {
        return "Customer Account Info";
    }
}
