package com.objis.demowenservice.simple;

import javax.xml.ws.Endpoint;

public class HelloObjisPublisher {

    public static void main(String[] var0) {
        short port = 8888;
        String url = "http://localhost:" + port + "/hello";
        System.out.println("Publishing Teams on port " + url);
        Endpoint.publish(url, new HelloObjisWS());
    }
}
