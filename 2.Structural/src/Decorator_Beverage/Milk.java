package Decorator_Beverage;

public class Milk extends CondimentDecorator {
    //ConcreteDecorator
    Beverage mBeverage;

    public Milk(Beverage beverage)
    {
        this.mBeverage = beverage;
    }

    public String getDescription()
    {
        return mBeverage.getDescription() + ", Milk";
    }

    public double cost()
    {
        return .30 + mBeverage.cost();
    }
}
