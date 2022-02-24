# WEBSERVICE SOAP

## Projet

Test de mise en place de webservice sous SOAP

TP tyes complexes: Mise en place d'un webservice avec des types Complexes.

## Pré-requis
* java jdk 8

## Création et démarrage du webservice et le client

### Création et démarrage du webservice
1. Ouvrir un terminal à la racine du dossier
2. Compiler les classe java : ```javac -d . projet-Teams/*.java```
3. Générer le webservice : ```wsgen -cp . com.objis.demowebservice.team.Teams```
4. Démarrer le webservice : ```java com.objis.demowebservice.team.TeamsPublisher```

### Création et démarrage du client
1. Avoir le webservice en marche (Voir section Création et démarrage du webservice)
2. Ouvrir un terminal à la racine du dossier
3. Générer le webservice : ```wsimport -p teamsClient -keep http://localhost:8888/teams?wsdl```
4. Compiler le client : ```javac -d . MyTeamsClient.java ```
5. Démarrer le client : ```java teamsClient.MyTeamsClient```

## liste des projet

Nom du projet | Description | Lien
---|---|----
tp2|Créer un WebService SOAP à partir du JDK| [tp2](https://github.com/asemin08/WebServicesSOAP)
tp3|Créer un client Java d’un WebService SOAP à partir du JDK| [tp3](https://github.com/asemin08/WebServicesSOAP/tree/tp3)
tp4|Mise en oeuvre d’intercepteurs (Handlers) de messages SOAP | [tp4](https://github.com/asemin08/WebServicesSOAP/tree/tp4)
tp5|assistant création Client et WebService à partir d’une Classe  | [tp5](https://github.com/asemin08/WebServicesSOAP/tree/tp5)
tp6|Demo WebService JAX-WS déployé dans un serveur d’application. |[tp6](https://github.com/asemin08/WebServicesSOAP/tree/tp6)
TpTypesComplexes|Tutoriel Web Service Soap : types complexes. |[TpTypesComplexes](https://github.com/asemin08/WebServicesSOAP/tree/TpTypesComplexes)
