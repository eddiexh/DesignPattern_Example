package AbstractFactory_Parser.Product;

import AbstractFactory_Parser.XMLParser;

public class NYOrderXMLParser implements XMLParser {
    //Product
    @Override
    public String parse() {
        System.out.println("NY Parsing order XML...");
        return "NY Order XML Message";
    }

}
