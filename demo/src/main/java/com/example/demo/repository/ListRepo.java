package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.models.ToDoList;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListRepo extends JpaRepository<ToDoList,Integer> {

    public List<ToDoList> findAllByName(String name);

    public  List<ToDoList> findById(int id) ;

    ToDoList save(ToDoList todo);
}
