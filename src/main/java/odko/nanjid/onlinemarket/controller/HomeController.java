package odko.nanjid.onlinemarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
@SessionAttributes({ "userName", "userObj" })
public class HomeController {

    @GetMapping(value = {"/", "/home"})
    public String homePage(Model model, HttpServletRequest request){
        return "index";
    }
}
