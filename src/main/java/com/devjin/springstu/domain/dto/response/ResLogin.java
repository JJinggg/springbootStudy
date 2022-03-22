package com.devjin.springstu.domain.dto.response;
import com.devjin.springstu.domain.entity.User;

public class ResLogin {


    private final boolean result;


    public ResLogin()
    {
        this.result = false;
    }

    public boolean getResult()
    {
        return result;
    }
}
