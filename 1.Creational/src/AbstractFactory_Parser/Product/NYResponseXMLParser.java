package AbstractFactory_Parser.Product;

import AbstractFactory_Parser.XMLParser;

public class NYResponseXMLParser implements XMLParser {
    //Product
    @Override
    public String parse() {
        System.out.println("NY Parsing response XML...");
        return "NY Response XML Message";
    }
}
