package FactoryMethod_DBConnectionFactory;

public class MySQLDBConnection implements DBConnection {
    //ConcreteProduct
    public void getConnection(){
        System.out.println("MySQL DB is connected");
    }
}
