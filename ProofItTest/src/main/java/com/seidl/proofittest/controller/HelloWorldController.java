/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seidl.proofittest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Áron
 */
@Controller
public class HelloWorldController {

    @RequestMapping(path = "/helloworld", method = RequestMethod.GET)
    public String openHelloPage() {
        return "helloworld";
    }

}
