# WEBSERVICE SOAP

## Projet

Test de mise en place de webservice sous SOAP

## Pré-requis
* java jdk 8

## Création et démarrage du webservice et le client

### Création et démarrage du webservice
1. Ouvrir un terminal à la racine du dossier
2. Compiler les classe java : ```javac -d . HelloObjisPublisher.java HelloObjisWS.java```
3. Générer le webservice : ```wsgen -cp . com.objis.demowenservice.simple.HelloObjisWS```
4. Démarrer le webservice : ```java com.objis.demowenservice.simple.HelloObjisPublisher```


### Création et démarrage du client
1. Avoir le webservice en marche (Voir section Création et démarrage du webservice)
2. Ouvrir un terminal à la racine du dossier
3. Générer le webservice : ```wsimport -p helloObjisClient -keep http://localhost:8888/hello?wsdl```
4. Compiler le client : ```javac -d . HelloObjisClient.java ```
5. Démarrer le client : ```java helloObjisClient.HelloObjisClient
```

## liste des projet

Nom du projet | Description | Lien
---|---|----
tp2|Créer un WebService SOAP à partir du JDK| [tp2](https://github.com/asemin08/WebServicesSOAP)
tp3|Créer un client Java d’un WebService SOAP à partir du JDK| [tp3](https://github.com/asemin08/WebServicesSOAP/tree/tp3)
tp4|Mise en oeuvre d’intercepteurs (Handlers) de messages SOAP | [tp4](https://github.com/asemin08/WebServicesSOAP/tree/tp4)
tp5|assistant création Client et WebService à partir d’une Classe  | [tp5](https://github.com/asemin08/WebServicesSOAP/tree/tp5)
tp6|Demo WebService JAX-WS déployé dans un serveur d’application. |[tp6](https://github.com/asemin08/WebServicesSOAP/tree/tp6)