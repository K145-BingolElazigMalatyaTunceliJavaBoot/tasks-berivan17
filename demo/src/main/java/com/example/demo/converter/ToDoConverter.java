package com.example.demo.converter;

import com.example.demo.models.ToDoList;
import com.example.demo.requestDto.SaveToToDoList;
import com.example.demo.responseDto.ToDoListResponseDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ToDoConverter {

    public ToDoList convertToDoDtoToDo(SaveToToDoList saveToToDoList){
        ToDoList todo=new ToDoList();
        todo.setName(saveToToDoList.getToDo());
        return todo;

    }
    public List<ToDoListResponseDto> convertToDoListResponseDtoList(List<ToDoList> toDoListList){
        List<ToDoListResponseDto> toDoListResponseDtoList=new ArrayList<>();

        for(ToDoList toDoList : toDoListList){
            ToDoListResponseDto toDoListResponseDto=new ToDoListResponseDto();
            toDoListResponseDto.setToDo(toDoList.getName());
            toDoListResponseDtoList.add(toDoListResponseDto);

        }
        return toDoListResponseDtoList;
    }



}
