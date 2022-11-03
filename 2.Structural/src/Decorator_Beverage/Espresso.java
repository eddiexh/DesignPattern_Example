package Decorator_Beverage;

public class Espresso extends Beverage {
    //ConcreteComponent
    public Espresso() {
        // 這個變數是繼承自 Beverage 的
        description = "Espresso";
    }

    public double cost() {
        // 目前這邊只是單純 Espresso 的價格,
        // 不含任何配料
        return 1.99;
    }
}
