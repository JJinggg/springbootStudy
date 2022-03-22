package com.devjin.springstu.domain.service;

import com.devjin.springstu.domain.dto.request.ReqPostLogin;
import com.devjin.springstu.domain.dto.request.ReqPostUser;
import com.devjin.springstu.domain.dto.response.ResLogin;
import com.devjin.springstu.domain.dto.response.ResUser;
import com.devjin.springstu.domain.entity.User;
import com.devjin.springstu.domain.repository.UserRepository;
import org.apache.juli.logging.Log;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;

import java.beans.beancontext.BeanContextServiceAvailableEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class LoginService {
    private final UserRepository userRepository;

    public LoginService(UserRepository _userreqository)
    {
        this.userRepository = _userreqository;
    }

    @Transactional(readOnly = true)
    private List<ResUser> getUser()
    {
        return userRepository.findAll().stream().map(ResUser::new).collect(Collectors.toList());
    }

    public boolean VaildUser(ReqPostLogin _reqPostLogin)
    {
        List<ResUser> _user = getUser();
        if (_user.stream().filter(x ->x.getId().equals(_reqPostLogin.getID())).count()<=0
        ||  _user.stream().filter(x ->x.getPwd().equals(_reqPostLogin.getPwd())).count()<=0) return false;
        return true;
    }

    public ResLogin getLoginResult(ReqPostLogin _reqPostLogin)
    {
        ResLogin resLogin = new ResLogin(VaildUser(_reqPostLogin));
        return resLogin;
    }
}









