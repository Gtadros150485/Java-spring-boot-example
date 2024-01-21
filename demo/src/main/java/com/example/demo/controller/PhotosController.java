package com.example.demo.controller;

import com.example.demo.model.Photo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhotosController {
    //this is not an error lobmok already created a contsructor
    private List<Photo> db = List.of(new Photo("1", "Photo.jpg"));
    @GetMapping("/")
    public String hello(){
        return "Hello, There I am a spring boot web application";
    }

    @GetMapping("/Photos")
    public List<Photo> getPhotos(){
        return db;
    }
}
