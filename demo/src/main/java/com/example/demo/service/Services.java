package com.example.demo.service;

import com.example.demo.converter.ToDoConverter;
import com.example.demo.models.ToDoList;
import com.example.demo.repository.ListRepo;
import com.example.demo.requestDto.SaveDtoToDo;
import com.example.demo.requestDto.UpdateDtoToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Services {

    @Autowired
    ListRepo listRepo;

    @Autowired
    ToDoConverter toDoConverter;

    @Autowired
    ListRepo ListRepo;

    public String saveToDo(SaveDtoToDo saveDtoToDo){
        ToDoList todo=toDoConverter.convertToDoDtoToDo(saveDtoToDo);
        todo=listRepo.save(todo);
        return String.valueOf(todo.getId());

    }
    public void updateToDo(UpdateDtoToDo updateDtoToDo) {

        int idToDoRequest = updateDtoToDo.getId();
        List<ToDoList> todoOptinal = ListRepo.findById(idToDoRequest);



    }

}
