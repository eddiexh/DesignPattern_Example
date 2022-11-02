package Observer_Archive;

public class Archiver implements Observer{
    public Archiver() {

    }

    public void update(String operation, String record) {
        System.out.println("This archiver says a " + operation + " operation was performed on " + record);
    }
}
