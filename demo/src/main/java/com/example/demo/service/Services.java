package com.example.demo.service;

import com.example.demo.converter.ToDoConverter;
import com.example.demo.models.ToDoList;
import com.example.demo.repository.ListRepo;
import com.example.demo.requestDto.SaveToToDoList;
import com.example.demo.requestDto.UpdateToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Services {

    @Autowired
    ListRepo listRepo;

    @Autowired
    ToDoConverter toDoConverter;

    public String saveToDo(SaveToToDoList saveToToDoList){
        ToDoList todo=toDoConverter.convertToDoDtoToDo(saveToToDoList);
        todo=listRepo.save(todo);
        return String.valueOf(todo.getId());

    }
    public void updateToDo(UpdateToDo updateToDo) {

        int idToDoRequest = updateToDo.getId();
        List<ToDoList> todoOptinal = ListRepo.findById(idToDoRequest);



    }

}
