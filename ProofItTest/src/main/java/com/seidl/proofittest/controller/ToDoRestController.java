/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seidl.proofittest.controller;

import com.seidl.proofittest.model.ToDo;
import com.seidl.proofittest.service.ToDoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Áron
 */
@RestController
@RequestMapping("/rest")
public class ToDoRestController {

    private Logger logger = LoggerFactory.getLogger(ToDoRestController.class);

    @Autowired
    private ToDoService todoService;

    @RequestMapping(path = "/todos", method = RequestMethod.GET, produces = "application/json")
    public List<ToDo> findAllToDos() {
        logger.info("findAllToDos() called");
        return todoService.getTodos();
    }

    @RequestMapping(path = "/todos", method = RequestMethod.POST, produces = "application/json")
    public ToDo addTodo(@RequestBody ToDo todo) {
        todoService.addTodo(todo);
        logger.info("addTodo() called with parameters: " + todo);
        return todo;
    }

    @RequestMapping(path = "/todos/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public void deleteTodo(@PathVariable("id") int id) {
        todoService.deleteTodo(id);
        logger.info("deleteTodo() called with parameters: " + id);
    }
}
