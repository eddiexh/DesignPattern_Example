package AbstractFactory_Parser;

import AbstractFactory_Parser.XMLParser;

public interface AbstractParserFactory {
    //AbstractFactory
    public XMLParser getParserInstance(String parserType);
}
