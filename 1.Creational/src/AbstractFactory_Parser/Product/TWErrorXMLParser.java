package AbstractFactory_Parser.Product;

import AbstractFactory_Parser.XMLParser;

public class TWErrorXMLParser implements XMLParser {
    //Product
    @Override
    public String parse() {
        System.out.println("TW Parsing error XML...");
        return "TW Error XML Message";
    }
}
