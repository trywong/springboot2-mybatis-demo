package com.charging.controller;

import com.charging.model.User;
import com.charging.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserService IUserService;

    @ResponseBody
    @PostMapping("/add")
    public int addUser(User user){
        return IUserService.addUser(user);
    }

    @ResponseBody
    @GetMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize){
        return IUserService.findAllUser(pageNum,pageSize);
    }
}
