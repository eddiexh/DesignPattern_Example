package Visitor_Liquor;

class Necessity implements Visitable {
//    ConcreteElement
    private double price;
    Necessity(double item) {
        price = item;
    }
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
    public double getPrice() {
        return price;
    }
}
