package www.com.jiange.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping({"/","/index"})
    public String index1(){
        return "index";
    }

    @GetMapping("/business")
    public String business(){
        return "business";
    }
    @GetMapping("/intro")
    public String intro(){
        return "intro";
    }
    @GetMapping("/team")
    public String team(){
        return "team";
    }
    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
}
