package FactoryMethod_DBConnectionFactory;

public class JavaDBConnection implements DBConnection{
    //ConcreteProduct
    public void getConnection(){
        System.out.println("Java DB is connected");
    }
}
