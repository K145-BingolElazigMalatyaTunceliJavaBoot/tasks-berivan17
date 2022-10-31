package com.example.demo.controller;

import com.example.demo.models.ToDoList;
import com.example.demo.requestDto.SaveDtoToDo;
import com.example.demo.service.Services;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/list")
public class Controller {

    @Autowired
    Services services;


    @PostMapping("/saveToDo")
    public String saveToDoList(@RequestBody SaveDtoToDo saveToToDoList) {
        return this.services.saveToDo(saveToToDoList);
    }






}
