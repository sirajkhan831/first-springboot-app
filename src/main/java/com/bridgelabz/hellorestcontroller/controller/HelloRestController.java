package com.bridgelabz.hellorestcontroller.controller;

import com.bridgelabz.hellorestcontroller.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloRestController {

    @GetMapping(value = {"/hello", "/"})
    public String usingGetMethod() {
        return "Hello from BridgeLabz";
    }

    @RequestMapping(value = {"/sayHello"})
    public String sayHello(
            @RequestParam(value = "name") String name) {
        return "Hello " + name;
    }

    @GetMapping("/sayName/{name}")
    public String sayHello1(
            @PathVariable String name) {
        return "Hello " + name;
    }

    @PostMapping(value = "/user")
    public User byUsingDto(
            @RequestBody User user) {
        return user;
    }

    @PutMapping(value = "/sayMyName/{firstName}")
    public String sayHelloFirstAndLastName(
            @PathVariable(name = "firstName") String firstName,
            @RequestParam(name = "lastName") String lastName
    ) {
        return "Hello " + firstName + " " + lastName;
    }
}
