package com.nabinuri.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HomeController {
    @RequestMapping("/index")
    fun hello(model: Model) : String{
        print("확인용!!!!!!")
        model.addAttribute("msg", "Hello Kotlin World!")
        return "index"
    }
}