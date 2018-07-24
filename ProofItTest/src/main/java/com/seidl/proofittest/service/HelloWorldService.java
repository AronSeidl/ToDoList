/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seidl.proofittest.service;

import org.springframework.stereotype.Component;

/**
 *
 * @author Áron
 */
@Component
public class HelloWorldService {

    public String printWelcome(String name) {
        return "Hello " + name;
    }

}
