package AbstractFactory_Parser.Product;

import AbstractFactory_Parser.XMLParser;

public class NYErrorXMLParser implements XMLParser {
    //Product
    @Override
    public String parse() {
        System.out.println("NY Parsing error XML...");
        return "NY Error XML Message";
    }

}
