package AbstractFactory_Parser;

public interface AbstractParserFactory {

    public XMLParser getParserInstance(String parserType);
}
