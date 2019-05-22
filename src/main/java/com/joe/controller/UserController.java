package com.joe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author maqiao
 * @create create on 2019-05-21 14:51
 * @desc
 **/
@RestController
public class UserController {

    @GetMapping("/test")
    public String test() {
        return "ok";
    }

}
