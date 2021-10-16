package guru.springframework.controllers;

import guru.springframework.commands.LoginCommand;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginForm(LoginCommand loginCommand) {
        return "loginForm";
    }

    @PostMapping("/login")
    public String processLogin(@Valid LoginCommand loginCommand, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "loginForm";

        return "redirect:/";

    }

}
