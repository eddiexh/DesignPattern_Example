package Decorator_Beverage;

public abstract class Beverage {
    //Component
    String description = "Unknown Beverage";
    public String getDescription() {
        return description;
    }

    // 留給子類別實作
    public abstract double cost();
}
