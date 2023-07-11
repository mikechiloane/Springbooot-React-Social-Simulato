package com.faboda.authserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth0")
public class AuthController {

    @GetMapping("/validate")
    public Boolean validate() {
        return true;
    }
}
