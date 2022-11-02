package FactoryMethod_DBConnectionFactory;

public class OracleDBConnection implements DBConnection{
    public void getConnection(){
        System.out.println("Oracle DB is connected");
    }
}