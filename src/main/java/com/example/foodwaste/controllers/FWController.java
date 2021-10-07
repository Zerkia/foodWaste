package com.example.foodwaste.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FWController {

  @GetMapping("/")
  public String index(){
    return "index";
  }

  @GetMapping("/foodplan")
  public String foodplan(){
    return "foodplan";
  }

  @GetMapping("/didyouknow")
  public String didYouKnow(){
    return "didYouKnow";
  }

  @GetMapping("/yourhelp")
  public String yourHelp(){
    return "yourHelp";
  }

  @GetMapping("/contact")
  public String contact() { return "contact"; }
}
