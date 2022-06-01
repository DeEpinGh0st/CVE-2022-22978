package cc.saferoad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController*/
@Controller
public class Demo {
    @GetMapping("/admin/*")
    public String Manage(){
        /*return "Manage page";*/
        return "manage";
    }

    @GetMapping("/")
    public String User(){
       /* return "Hello bro";*/
        return "index";
    }
}
