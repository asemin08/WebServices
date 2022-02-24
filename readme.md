# WEBSERVICE SOAP

## Projet

Test de mise en place de webservice sous SOAP
tp6: Demo WebService JAX-WS déployé dans un serveur d’application. Mise en place d'un ws sur un serveur tomcat
## Pré-requis
* java jdk 8
* maven 3.8.4
* tomcat version 9


## Création et déployement du webservice 

### Création et démarrage du webservice
1. Ouvrir un terminal à la racine du dossier
2. Ce rendre dans le dossier du code source : ```cd webservice```
3. Générer le war du webservice : ```mvn clean package```
4. Vérifier si le fichier webservice.war à été créé dans le dossier du projet => webservice => target 
5. Ouvrir un navigateur
6. Ce rendre sur la page pour déployer un war sur tomcat :(si installer en local [tomcat](http://localhost:8080/manager/html))
7. S'authentifier
8. Trouver la section "Fichier WAR à déployer"
9. Cliquer sur "Choisir un fichier" et séléctionner le fichier webservice.war
10. Cliquer sur déployer
11. Vérifier que webservice est présent dans la liste des applications déployer


### Tester le webservice
1. Ouvrir un navigateur
2. Se rendre sur [monEndpoint](http://localhost:8080/webservice/hello)
3. Voir le tableau récapitulatif s'afficher

## liste des projet

Nom du projet | Description | Lien
---|---|----
tp2|Créer un WebService SOAP à partir du JDK| [tp2](https://github.com/asemin08/WebServicesSOAP)
tp3|Créer un client Java d’un WebService SOAP à partir du JDK| [tp3](https://github.com/asemin08/WebServicesSOAP/tree/tp3)
tp4|Mise en oeuvre d’intercepteurs (Handlers) de messages SOAP | [tp4](https://github.com/asemin08/WebServicesSOAP/tree/tp4)
tp5|assistant création Client et WebService à partir d’une Classe  | [tp5](https://github.com/asemin08/WebServicesSOAP/tree/tp5)
tp6|Demo WebService JAX-WS déployé dans un serveur d’application. |[tp6](https://github.com/asemin08/WebServicesSOAP/tree/tp6)
TpTypesComplexes|Tutoriel Web Service Soap : types complexes. |[TpTypesComplexes](https://github.com/asemin08/WebServicesSOAP/tree/TpTypesComplexes)
