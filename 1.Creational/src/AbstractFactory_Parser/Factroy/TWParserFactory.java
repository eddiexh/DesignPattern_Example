package AbstractFactory_Parser.Factroy;

import AbstractFactory_Parser.AbstractParserFactory;
import AbstractFactory_Parser.Product.TWErrorXMLParser;
import AbstractFactory_Parser.Product.TWFeedbackXMLParser;
import AbstractFactory_Parser.Product.TWOrderXMLParser;
import AbstractFactory_Parser.Product.TWResponseXMLParser;
import AbstractFactory_Parser.XMLParser;

public class TWParserFactory implements AbstractParserFactory {
    //ConcreteFactory
    @Override
    public XMLParser getParserInstance(String parserType) {

        switch(parserType){
            case "TWERROR": return new TWErrorXMLParser();
            case "TWFEEDBACK": return new TWFeedbackXMLParser();
            case "TWORDER": return new TWOrderXMLParser();
            case "TWRESPONSE": return new TWResponseXMLParser();
        }
        return null;
    }
}
