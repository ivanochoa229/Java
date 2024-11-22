package org.singleton;

/**
 Reglas:
    1) Debemos tener un constructor privado
    2) Debemos tener un atributo privado estático
    3) Debemos tener un metodo estático que devuelva la instancia
 */


public class DatabaseConnector {

    private static DatabaseConnector instance;

    private DatabaseConnector() {
        System.out.println("Creating object");
    }

    public static synchronized DatabaseConnector getInstance(){
        if(instance == null){
            instance = new DatabaseConnector();
        }
        return instance;
    }

    public void connectDatabase(){
        System.out.println("Connecting database = " + instance);
    }

    public void disconnectDatabase(){
        System.out.println("Disconnecting database = " + instance);
    }

}
