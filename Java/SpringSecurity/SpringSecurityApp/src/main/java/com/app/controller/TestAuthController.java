package com.app.controller;

//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
//@PreAuthorize("denyAll()")
public class TestAuthController {
//    @GetMapping("/hello")
//    @PreAuthorize("permitAll()")
//    public String hello() {
//        return "Hello world";
//    }
//    @GetMapping("/hello-secured")
//    @PreAuthorize("hasAuthority('WRITE')")
//    public String helloSecured() {
//        return "Hello world Secured";
//    }
//
//    @GetMapping("/hello-secured2")
//    public String helloSecured2() {
//        return "Hello world Secured 2";
//    }

    @GetMapping("/")
    //@PreAuthorize("hasAuthority('READ')")
    public String helloGet(){
        return "Hello World - GET";
    }

    @PostMapping("/")
    //@PreAuthorize("hasAuthority('CREATE') or hasAuthority('READ')")
    public String helloPost(){
        return "Hello World - POST";
    }

    @PutMapping("/")
    public String helloPut(){
        return "Hello World - PUT";
    }

    @DeleteMapping("/")
    public String helloDelete(){
        return "Hello World - DELETE";
    }

    @PatchMapping("/")
    //@PreAuthorize("hasAuthority('REFACTOR')")
    public String helloPatch(){
        return "Hello World - PATCH";
    }

}
