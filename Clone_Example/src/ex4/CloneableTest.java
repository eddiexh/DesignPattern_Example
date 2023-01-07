package ex4;

public class CloneableTest {
    public static void main(String[] args) {
        Person2 p = new Person2("Sam");
        Person2 pClone = p.clone();
        System.out.println(pClone.getName());
    }
}
