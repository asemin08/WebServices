# WEBSERVICE SOAP

## Projet

Test de mise en place de webservice sous SOAP

tp3 : Créer un client Java d’un WebService SOAP à partir du JDK

## Pré-requis
* java jdk 8
* Perl
* Ruby

## Démarrage du Webservice et des clients

### Démarrer le webservice 
1. Ouvrir un terminal à la racine du dossier
2. Se place dans le dossier src : ```cd src/```
3. Compiler les classe java : ```javac eu/ensup/allan/*.java```
4. Démarrer le webservice : ```java eu/ensup/allan/HelloPublisher```

### Tester le webservice avec un client Java 
1. Avoir le webservice en marche (Voir section Démarrer le webservice)
2. Ouvrir un terminal à la racine du dossier
3. Se place dans le dossier src : ```cd src/```
4. Compiler les classe java : ```javac client/*.java```
5. Démarrer le client : ```java client/MonCodeClient```

### Tester un webservice soap d'internet avec un client Java
1. Ouvrir un terminal à la racine du dossier
2. Se place dans le dossier src : ```cd src/```
3. Compiler les classe java : ```javac clientCelciusToFahrenheit/*.java```
4. Démarrer le client : ```java clientCelciusToFahrenheit/MonCodeClientCelsiusToFahrenheit```

### Tester le webservice avec un client perl
1. Avoir le webservice en marche (Voir section Démarrer le webservice)
2. Ouvrir un terminal à la racine du dossier
3. Se place dans le dossier src : ```cd src/```
4. Démarrer le client : ```perl clientPerl\clientWSPerl.pl```

### Tester le webservice avec un client Ruby
1. Avoir le webservice en marche (Voir section Démarrer le webservice)
2. Ouvrir un terminal à la racine du dossier
3. Se place dans le dossier src : ```cd src/```
4. Démarrer le client : ```ruby ClientRuby\ClientRuby.rb```
5. (Si il s'agit de la première fois que vous lancé le client ruby est que vous avais une erreur éxéctuer cette commande pour installer les dépandences pour SOAP pour ruby. ```gem install soap4r-ruby1.9```. Recommencer les différentes étapes).
## liste des projet

Nom du projet | Description | Lien
---|---|----
tp2|Créer un WebService SOAP à partir du JDK| [tp2](https://github.com/asemin08/WebServicesSOAP)
tp3|Créer un client Java d’un WebService SOAP à partir du JDK| [tp3](https://github.com/asemin08/WebServicesSOAP/tree/tp3)
tp4|Mise en oeuvre d’intercepteurs (Handlers) de messages SOAP | [tp4](https://github.com/asemin08/WebServicesSOAP/tree/tp4)
tp5|assistant création Client et WebService à partir d’une Classe  | [tp5](https://github.com/asemin08/WebServicesSOAP/tree/tp5)
tp6|Demo WebService JAX-WS déployé dans un serveur d’application. |[tp6](https://github.com/asemin08/WebServicesSOAP/tree/tp6)
TpTypesComplexes|Tutoriel Web Service Soap : types complexes. |[TpTypesComplexes](https://github.com/asemin08/WebServicesSOAP/tree/TpTypesComplexes)
