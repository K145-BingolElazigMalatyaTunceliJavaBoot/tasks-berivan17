package com.example.demo.controller;

import com.example.demo.requestDto.SaveToToDoList;
import com.example.demo.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/list")
public class Controller {

    @Autowired
    Services services;


    @PostMapping("/saveToDo")
    public String saveToDoList(@RequestBody SaveToToDoList  saveToToDoList) {
        return this.services.saveToDo(saveToToDoList);
    }




}
