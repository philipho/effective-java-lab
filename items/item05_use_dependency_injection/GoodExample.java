package item05_use_dependency_injection;

import java.util.function.Supplier;

public class GoodExample {
    public static void processNumber(Supplier<? extends Number> factory) {
        Number number = factory.get();
        System.out.println("Processing number: " + number);
    }

    public static void main(String[] args) {
        Supplier<Integer> intProvider = () -> 5;
        Supplier<Double> doubleProvider = () -> 3.14;
        processNumber(intProvider);
        processNumber(doubleProvider);
    }
}
