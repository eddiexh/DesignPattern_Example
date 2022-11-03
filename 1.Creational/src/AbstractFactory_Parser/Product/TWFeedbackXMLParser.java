package AbstractFactory_Parser.Product;

import AbstractFactory_Parser.XMLParser;

public class TWFeedbackXMLParser implements XMLParser {
    //Product
    @Override
    public String parse() {
        System.out.println("TW Parsing feedback XML...");
        return "TW Feedback XML Message";
    }
}
