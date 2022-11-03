package AbstractFactory_Parser.Product;

import AbstractFactory_Parser.XMLParser;

public class TWResponseXMLParser implements XMLParser {
    //Product
    @Override
    public String parse() {
        System.out.println("TW Parsing response XML...");
        return "TW Response XML Message";
    }
}
