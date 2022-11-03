package Decorator_Beverage;

public class Mocha extends CondimentDecorator {
    //ConcreteDecorator
    // 要讓摩卡能參考到 Beverage,
    // 因此需要這個成員變數
    Beverage mBeverage;

    public Mocha(Beverage beverage) {
        this.mBeverage = beverage;
    }

    // 以下兩個 method 的作法都是利用委派(delegation) 的方式,
    // 從被裝飾者拿到資訊後, 再加上裝飾者的資訊
    public String getDescription() {
        return mBeverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + mBeverage.cost();
    }
}
