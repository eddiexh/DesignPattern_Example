package Visitor_Liquor;

class Tobacco implements Element {
    //ConcreteElement
    private double price;
    Tobacco(double item) {
        price = item;
    }
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
    public double getPrice() {
        return price;
    }
}
