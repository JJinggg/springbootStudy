package com.devjin.springstu.domain.dto.request;

import com.devjin.springstu.domain.entity.User;
import com.sun.istack.NotNull;

public class ReqPostLogin {

    @NotNull
    private String id;
    @NotNull
    private String pwd;
    private String email;


    public String getID(){return id;}
    public String getPwd(){return pwd;}
    public String getEmail(){return email;}


    public void setID(String id){this.id = id;}
    public void setPwd(String pwd){this.pwd = pwd;}
    public void setEmail(String email){this.email = id;}

}
