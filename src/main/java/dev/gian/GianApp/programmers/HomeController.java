package dev.gian.GianApp.controllers;


import dev.gian.GianApp.models.ProgrammerModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index(ProgrammerModel user){
        return
    }



}
