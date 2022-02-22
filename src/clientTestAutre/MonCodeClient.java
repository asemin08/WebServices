package clientTestAutre;


import clientTestAutre.HelloWSService;
import clientTestAutre.IHello;

public class MonCodeClient {

    public static void main(String[] args) {

        // 1. instanciation du service (générer par wsimport)
        HelloWSService helloWSService = new HelloWSService();

        // 2. Récupération du client
        IHello port = helloWSService.getHelloWSPort();

        String resultat = port.ditBonjour("ALlan");

        System.out.println(resultat);
    }
}
