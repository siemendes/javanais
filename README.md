## About it

API REST permettant de transformer une phrasefrançaise en javanais et inversement. 


## Running end-to-end tests

L'application est une application springboot 2.1.5.
Le jdk utilisé est le 11.0.2


## Lancer le jeu

Il suffit de faire un appel REST :
http://localhost:8080/javanais/transformation/input_str => transforme une phrase en imput en javanais
http://localhost:8080/javanais/rollback/input_str => retour arrière d'une phrase ayant été transformée en input en javanais
