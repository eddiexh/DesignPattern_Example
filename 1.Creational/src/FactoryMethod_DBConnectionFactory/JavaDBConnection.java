package FactoryMethod_DBConnectionFactory;

public class JavaDBConnection implements DBConnection{
    public void getConnection(){
        System.out.println("Java DB is connected");
    }
}
