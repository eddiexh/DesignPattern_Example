package Visitor_Liquor;

class Liquor implements Element {
    //ConcreteElement
    private double price;
    Liquor(double item) {
        price = item;
    }
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
    public double getPrice() {
        return price;
    }
}
