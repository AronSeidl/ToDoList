/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seidl.proofittest.model;

import java.util.Date;

/**
 *
 * @author Áron
 */
public class ToDo {

    private static int statId = 0;
    private final int id;
    private String task;
    private Date createdAt = new Date();

    public ToDo(String task) {
        this.task = task;
        statId++;
        id = statId;
    }

    public ToDo() {
        statId++;
        id = statId;
    }

    public String getTask() {
        return task;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public int getId() {
        return id;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "ToDo{" + "id=" + id + ", task=" + task + ", createdAt=" + createdAt + '}';
    }
}
