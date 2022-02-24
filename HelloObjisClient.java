package helloObjisClient;

public class HelloObjisClient {

    public static void main(String[] args) {

        // 1. instanciation du service (générer par wsimport)
        HelloObjisWSService helloObjisWSService = new HelloObjisWSService();

        // 2. Récupération du client
        HelloObjisWS port = helloObjisWSService.getHelloObjisWSPort();

        String resultat = port.getHello();

        System.out.println(resultat);
    }
}
