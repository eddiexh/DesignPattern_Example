package AbstractFactory_Parser.Factroy;

import AbstractFactory_Parser.AbstractParserFactory;
import AbstractFactory_Parser.Product.NYErrorXMLParser;
import AbstractFactory_Parser.Product.NYFeedbackXMLParser;
import AbstractFactory_Parser.Product.NYOrderXMLParser;
import AbstractFactory_Parser.Product.NYResponseXMLParser;
import AbstractFactory_Parser.XMLParser;

public class NYParserFactory implements AbstractParserFactory {
    //ConcreteFactory
    @Override
    public XMLParser getParserInstance(String parserType) {
        switch(parserType){
            case "NYERROR": return new NYErrorXMLParser();
            case "NYFEEDBACK": return new NYFeedbackXMLParser();
            case "NYORDER": return new NYOrderXMLParser();
            case "NYRESPONSE": return new NYResponseXMLParser();
        }
        return null;
    }
}
