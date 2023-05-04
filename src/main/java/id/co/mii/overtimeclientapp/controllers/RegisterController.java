package id.co.mii.overtimeclientapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import id.co.mii.overtimeclientapp.models.dto.requests.UserRequest;
import id.co.mii.overtimeclientapp.services.RegisterService;
import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/register")
@AllArgsConstructor
public class RegisterController {

    private RegisterService registerService;

    @GetMapping
    public String registerPage(UserRequest userRequest){
        return "auth/register";
    }

    @PostMapping
    public String register(UserRequest userRequest){
        registerService.register(userRequest);
        return "redirect:/login";
    }
    
}
