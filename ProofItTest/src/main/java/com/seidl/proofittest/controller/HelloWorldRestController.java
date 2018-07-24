/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seidl.proofittest.controller;

import com.seidl.proofittest.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Áron
 */
@RestController
@RequestMapping("/rest")
public class HelloWorldRestController {

    @Autowired
    HelloWorldService helloWorldService;

    @RequestMapping(path = "/helloworld", method = RequestMethod.GET)
    public String generateWelcomeMessage(@RequestParam(required = false, name = "username") String userName) {
        return helloWorldService.printWelcome(userName);
    }

}
