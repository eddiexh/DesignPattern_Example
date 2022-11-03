package Bridge_CarRemoteController;

public class CentralLocking implements Product{
    //ConcreteImplementor
    private final String productName;
    public CentralLocking(String productName){
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Central Locking System");
    }
}
