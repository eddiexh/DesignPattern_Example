package Observer_Archive;

public class Boss implements Observer{
    public Boss() {

    }
    public void update(String operation, String record) {
        System.out.println("This Boss says a " + operation + " operation was performed on " + record);
    }
}
