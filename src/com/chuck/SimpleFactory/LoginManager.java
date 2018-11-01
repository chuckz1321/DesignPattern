package com.chuck.SimpleFactory;

public class LoginManager {
    // refer to java.text.DataFormat
    public static Login factory(String type){
        if(type == "password"){
            return new PassLogin();
        }else if (type == "domain"){
            return new DomainLogin();
        }else{
            throw new RuntimeException("No Such Type");
        }
    }
}
