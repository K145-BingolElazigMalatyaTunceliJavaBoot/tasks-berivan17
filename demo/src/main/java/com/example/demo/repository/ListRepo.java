package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import com.example.demo.models.ToDoList;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListRepo extends CrudRepository<ToDoList,Integer> {

    public List<ToDoList> findAllByName(String name);
    public static List<ToDoList> findById(int id);

    ToDoList save(ToDoList todo);
}
