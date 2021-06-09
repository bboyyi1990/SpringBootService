package com.yi.controller;

import com.yi.data.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * user 控制层
 * 在此声明接口
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    //    @Autowired
//    private UserService userService;
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @ResponseBody
    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String index() {
        return "user/index";
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    @ResponseBody
    public User queryUser(@RequestParam(name = "id") String id, @RequestBody User user) {
//        Integer id = (Integer) map.get("bodyId");
        user.setName("from service name user " + user.getName());
        return user;
    }
}
