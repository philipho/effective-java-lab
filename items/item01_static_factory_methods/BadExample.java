package item01_static_factory_methods;

public class BadExample {
    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        Person p2 = new Person("Bob");
        // No flexibility, no caching possible
    }
}

class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }
}

