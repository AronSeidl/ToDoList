/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seidl.proofittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author Áron
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.seidl.proofittest")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
