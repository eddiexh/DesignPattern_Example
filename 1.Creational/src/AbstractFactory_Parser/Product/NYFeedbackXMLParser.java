package AbstractFactory_Parser.Product;

import AbstractFactory_Parser.XMLParser;

public class NYFeedbackXMLParser implements XMLParser {
    //Product
    @Override
    public String parse() {
        System.out.println("NY Parsing feedback XML...");
        return "NY Feedback XML Message";
    }

}
