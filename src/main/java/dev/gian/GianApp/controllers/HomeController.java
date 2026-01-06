package dev.gian.GianApp.controllers;


import dev.gian.GianApp.models.UserModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index(UserModel user){
        return
    }



}
