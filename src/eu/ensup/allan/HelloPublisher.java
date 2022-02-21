package eu.ensup.allan;

import javax.xml.ws.Endpoint;

public class HelloPublisher {

    public static final String URI = "http://localhost:8888/hello";

    public static void main(String[] args) {
	    // Instance de l'implementation Hello
        HelloWS impl = new HelloWS();

        // Rend disponible l'instance
        Endpoint endpoint = Endpoint.publish(URI, impl);

        // teste la dispo du endpoint
        boolean status = endpoint.isPublished();
        System.out.println("Web service disponible " + status);
    }
}
