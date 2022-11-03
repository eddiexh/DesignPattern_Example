package FactoryMethod_DBConnectionFactory;

public class MyDBConnectionFactory implements DBConnectionFactory{
    //ConcreteCreator
    private String type;
    public MyDBConnectionFactory(String type){
        this.type=type;
    }
    public DBConnection createConnection(){
        if (type.equalsIgnoreCase("Oracle")){
            return new OracleDBConnection();
        } else if (type.equalsIgnoreCase("MySQL")){
            return new MySQLDBConnection();
        } else if (type.equalsIgnoreCase("JavaDB")){
            return new JavaDBConnection();
        } else {
            //default product
            return new OracleDBConnection();
        }
    }
}
