package com.srishti.customerservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createOrder() {
        return "Order placed by user";
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getGeneralCustomerInfo() {
        return "Customer info";
    }
}
