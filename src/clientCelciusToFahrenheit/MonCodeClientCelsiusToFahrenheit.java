package clientCelciusToFahrenheit;

import client.Hello;
import client.HelloWSService;

public class MonCodeClientCelsiusToFahrenheit {

    public static void main(String[] args) {

        // 1. instanciation du service (générer par wsimport)
        TempConvert tempConvert = new TempConvert();

        // 2. Récupération du client
        TempConvertSoap port = tempConvert.getTempConvertSoap();

        String resultat = port.celsiusToFahrenheit("12");

        System.out.println(resultat);

    }
}
