package ex1;

public class Person{
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Person p = new Person("Sam");
        try {
            Person pClone = (Person) p.clone();
            System.out.println(pClone.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

