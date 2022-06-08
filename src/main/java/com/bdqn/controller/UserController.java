package com.bdqn.controller;

import com.bdqn.pojo.User;
import com.bdqn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/list")
    public String list(Model model){
        List<User> list = userService.list();
        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("toAdd")
    public String toAdd(){
        return "addUser";
    }
    @RequestMapping("add")
    public String addUser(User user){
        userService.addUser(user);
        return "redirect:list";
    }
    @RequestMapping("delete")
    public String delete(int id){
        userService.delete(id);
        return "redirect:list";
    }
    @RequestMapping("update")
    public String update(User user){
        userService.update(user);
        return "redirect:list";
    }
    @RequestMapping("toupdate")
    public String toupdate(Model model,int id){
        User user = userService.findUserById(id);
        model.addAttribute("user",user);
        return "update";
    }

}
