package ru.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.app.model.User;
import ru.app.service.UserService;

@Controller
@RequestMapping("/")
public class IndexController {


    private final UserService userService;

    public IndexController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String redirect() {

        return "redirect:/users";
    }
}


/*







 */