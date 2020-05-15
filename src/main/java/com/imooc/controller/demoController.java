package com.imooc.controller;

import com.imooc.tools.CodeMsg;
import com.imooc.tools.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class demoController {

    @RequestMapping("/hello")
    @ResponseBody
    public Result<String> hello(){
        return Result.success("hello pomoeoro");
    }


    @RequestMapping("/helloError")
    @ResponseBody
    public Result<String> helloError(){
        return Result.error(CodeMsg.SERVER_ERROR);
    }


    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("name","pomodoro");
        return "hello";
    }
}
