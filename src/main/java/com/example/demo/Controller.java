package com.example.demo;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path="/v1")
public class Controller  {

    @GetMapping("/")
    ResponseEntity<?> testMethod(){
        System.out.println("test");
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}
