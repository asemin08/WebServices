package client;

public class MonCodeClient {

    public static void main(String[] args) {

        // 1. instanciation du service (générer par wsimport)
        HelloWSService helloWSService = new HelloWSService();

        // 2. Récupération du client
        Hello port = helloWSService.getHelloWSPort();

        String resultat = port.ditBonjour("toto");

        System.out.println(resultat);
    }
}
