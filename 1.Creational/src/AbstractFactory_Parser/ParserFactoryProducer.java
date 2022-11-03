package AbstractFactory_Parser;

import AbstractFactory_Parser.Factroy.NYParserFactory;
import AbstractFactory_Parser.Factroy.TWParserFactory;

public final class ParserFactoryProducer {
    private ParserFactoryProducer(){
        throw new AssertionError();
    }
    public static AbstractParserFactory getFactory(String factoryType){
        switch(factoryType){
            case "NYFactory": return new NYParserFactory();
            case "TWFactory": return new TWParserFactory();
        }
        return null;
    }
}
