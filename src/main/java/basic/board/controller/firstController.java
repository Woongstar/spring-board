package basic.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class firstController {

    @GetMapping("/greeting")
    public String greeting(Model model){
        model.addAttribute("username","Woongstar");
        return "greetings";
    }

    @GetMapping("/bye")
    public String goodBye(Model model){
        model.addAttribute("username","CountiStar");
        return "goodbye";
    }
}
