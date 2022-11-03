package Observer_Archive;

import Observer_Archive.ConcreteObserver.Archiver;
import Observer_Archive.ConcreteObserver.Boss;
import Observer_Archive.ConcreteObserver.Client;
import Observer_Archive.ConcreteSubject.Database;

public class TestObserver {
    public static void main(String[] args) {
        Database database = new Database();
        Archiver archiver = new Archiver();
        Client client = new Client();
        Boss boss = new Boss();

        database.registerObserver(archiver);
        database.registerObserver(client);
        database.registerObserver(boss);
        database.editRecord("delete", "record 1");
    }
}
