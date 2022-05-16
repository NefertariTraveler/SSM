package com.javacto.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javacto.po.User;
import com.javacto.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * liu
 **/
@Controller
@RequestMapping("/user")
public class UserAction {
    @Resource
    UserService userService;

    @RequestMapping("/goUser")
    public String goUser(){
        return "addUser";
    }

    @RequestMapping("/add")
    public String add(User user){
        userService.add(user);
        return "redirect:/rest/user/query";
    }

    @RequestMapping("/delete/{tid}")
    public String delete(@PathVariable("tid") int id){
        userService.delete(id);
        return "redirect:/rest/user/query";
    }

    @RequestMapping("/findById/{tid}")
    public String findById(Model model,@PathVariable("tid") int id){
        User byId = userService.findById(id);
        model.addAttribute("list",byId);
        return "updateUser";
    }

    @RequestMapping("/update")
    public String update(User user){
        userService.update(user);
        return "redirect:/rest/user/query";
    }

    @RequestMapping("/query")
    public String query(Model model,Integer pageNum){
        if (pageNum == null) {
            pageNum = 1;
        }
        PageHelper.startPage(pageNum,2);
        List<User> query = userService.query();
        PageInfo<User> pageInfo = new PageInfo<>(query);
        model.addAttribute("list",pageInfo.getList());
        model.addAttribute("info",pageInfo);
        return "userList";
    }
}
