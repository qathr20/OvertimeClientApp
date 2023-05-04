package id.co.mii.overtimeclientapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import id.co.mii.overtimeclientapp.models.dto.requests.LoginRequest;
import id.co.mii.overtimeclientapp.services.LoginService;
import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/login")
@AllArgsConstructor
public class LoginController {
    
    private LoginService loginService;

    @GetMapping
    public String loginPage(LoginRequest loginRequest){
        return "auth/login";
    }

    @PostMapping
    public String login(LoginRequest loginRequest){
        if (!loginService.login(loginRequest)){
            return "redirect:/login?error=true";
        }
        return "redirect:/dashboard";
    }
}
