package cn.yykjc.jiaochengdemo.user.controller;

import cn.yykjc.jiaochengdemo.user.entity.UserEntity;


import cn.yykjc.jiaochengdemo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

/*
*
*  重定向不能用：@RestController
*  RestController =@ResponseBody+@Controller
* */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map){

        return userService.getAll(map);
    }

    @RequestMapping("/delById")
    public String delById(Integer id) {
        userService.delById(id);
        return "redirect:/index.html";
    }

    // 保存用户
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody UserEntity userEntity) {

        System.out.println("用户注册 - " + userEntity.toString());
        userService.save(userEntity);
        return "success";
    }
}
