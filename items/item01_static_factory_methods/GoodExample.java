package item01_static_factory_methods;

public class GoodExample {
    public static void main(String[] args) {
        GoodPerson p1 = GoodPerson.of("Alice");
        GoodPerson p2 = GoodPerson.of("Bob");
    }
}

class GoodPerson {
    private final String name;

    private GoodPerson(String name) {
        this.name = name;
    }

    public static GoodPerson of(String name) {

        return new GoodPerson(name); // could be cached later if needed
    }
}


