package com.devjin.springstu.domain.controller;

import com.devjin.springstu.domain.dto.request.ReqPostLogin;
import com.devjin.springstu.domain.dto.response.ResLogin;
import com.devjin.springstu.domain.dto.response.ResUser;
import com.devjin.springstu.domain.dto.request.ReqPostUser;
import com.devjin.springstu.domain.entity.User;
import com.devjin.springstu.domain.service.LoginService;
import com.devjin.springstu.domain.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/login")
public class LoginController {
    private final  LoginService loginService;
    public LoginController(LoginService _loginService)
    {
        this.loginService = _loginService;
    }

    @PostMapping
    @ResponseBody
    public ResLogin VerificationUser(@RequestBody @Valid ReqPostLogin _reqPostLogin)
    {
        return loginService.getLoginResult(_reqPostLogin);
    }

}
