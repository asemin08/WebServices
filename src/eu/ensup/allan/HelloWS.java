package eu.ensup.allan;

import javax.jws.HandlerChain;
import javax.jws.WebService;

@WebService(endpointInterface = "eu.ensup.allan.Hello")
@HandlerChain(file = "LogMessageHandler.xml")
public class HelloWS implements Hello{

    @Override
    public String ditBonjour(String name) {
        return "Hello, " + name + "!";
    }
}