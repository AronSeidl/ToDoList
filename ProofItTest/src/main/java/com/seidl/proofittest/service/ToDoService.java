/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seidl.proofittest.service;

import com.seidl.proofittest.model.ToDo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Áron
 */
@Component
public class ToDoService {

    private final static List<ToDo> todos = new ArrayList<>();

    public List<ToDo> getTodos() {
        return todos;
    }

    public void addTodo(ToDo todo) {
        todos.add(todo);
    }

    public void deleteTodo(int id) {
        Iterator<ToDo> iter = todos.iterator();
        while (iter.hasNext()) {
            if (iter.next().getId() == id) {
                iter.remove();
            }
        }
    }

}
