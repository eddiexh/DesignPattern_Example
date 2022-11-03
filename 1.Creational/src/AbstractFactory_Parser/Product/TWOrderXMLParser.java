package AbstractFactory_Parser.Product;

import AbstractFactory_Parser.XMLParser;

public class TWOrderXMLParser implements XMLParser {
    //Product
    @Override
    public String parse() {
        System.out.println("TW Parsing order XML...");
        return "TW Order XML Message";
    }
}
