package com.example.myplaces.restfulwebservices;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorldController {

    //GET
    //URI - /hello-world
    //method - "Hello World"
    @GetMapping(path = "/hello-world")
    public HelloWorldBean helloWorld(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorlds(){
        return new HelloWorldBean("Hell World");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }

}
