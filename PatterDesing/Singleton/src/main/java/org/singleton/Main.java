package org.singleton;

public class Main {
    public static void main(String[] args) {
        DatabaseConnector databaseConnector = DatabaseConnector.getInstance();
        System.out.println("databaseConnector = " + databaseConnector);
        DatabaseConnector databaseConnector2 = DatabaseConnector.getInstance();
        System.out.println("databaseConnector2 = " + databaseConnector2);
        System.out.println("\n");
        databaseConnector.connectDatabase();
        databaseConnector2.connectDatabase();
    }
}