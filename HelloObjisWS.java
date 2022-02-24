package com.objis.demowenservice.simple;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloObjisWS {

    public HelloObjisWS() {
    }

    @WebMethod
    public String getHello() {
        return "Hello Objis!";
    }

}

