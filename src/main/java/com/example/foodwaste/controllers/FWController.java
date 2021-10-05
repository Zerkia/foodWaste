package com.example.foodwaste.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FWController {

  @GetMapping("/")
  public String index(){
    return "index";
  }
}
