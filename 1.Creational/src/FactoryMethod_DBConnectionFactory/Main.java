package FactoryMethod_DBConnectionFactory;

public class Main {
    public static void main(String[] args) {
        MyDBConnectionFactory factory = new MyDBConnectionFactory("JavaDB");
        factory.createConnection().getConnection();

        factory = new MyDBConnectionFactory("MySQL");
        factory.createConnection().getConnection();

        factory = new MyDBConnectionFactory("Oracle");
        factory.createConnection().getConnection();
    }
}
