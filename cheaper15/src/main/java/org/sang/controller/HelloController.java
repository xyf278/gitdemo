package org.sang.controller;

import org.sang.bean.Role;
import org.sang.bean.User;
import org.sang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    UserService userService;
    @RequestMapping("/user/like")
    public ModelAndView user(){
        ModelAndView modelAndView=new ModelAndView("index");
       List<Role> roles =userService.getUserById(1);
       modelAndView.addObject("role",roles);
        return modelAndView;
    }
    @RequestMapping("/admin/like")
    public String admin(){
        return "/admin/like";
    }
    @RequestMapping("/dba/like")
    public String dba(){
        return "/dba/like";
    }
    @RequestMapping("/all/like")
    public String all(){
        return "all/like";
    }
}
