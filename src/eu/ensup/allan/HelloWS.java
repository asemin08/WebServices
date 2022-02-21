package eu.ensup.allan;

import javax.jws.WebService;

@WebService(endpointInterface = "eu.ensup.allan.Hello")
public class HelloWS implements Hello{

    @Override
    public String ditBonjour(String name) {
        return "Hello, " + name + "!";
    }
}