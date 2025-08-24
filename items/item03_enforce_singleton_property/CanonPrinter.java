package item03_enforce_singleton_property;

public class CanonPrinter implements Printer {
    private static int id = 1;
    private static Printer PRINTER = new CanonPrinter(id++);
    private final String name;

    private CanonPrinter(int id) {
        this.name = "PRINTER-" + id;
    }

    @Override
    public void print(String msg) {
        System.out.println("Printer=" + name + ", msg=" + msg);
    }

    @Override
    public String getName() {
        return name;
    }

    // static factory method
    public static Printer getInstance() {
        return PRINTER;
    }

    //------------- test
    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread(() -> {
            Printer aPrinter = CanonPrinter.getInstance();
            aPrinter.print("This is aPrinter message, haha");
        });
        th.start();

        Printer aPrinter2 = CanonPrinter.getInstance();
        aPrinter2.print("this is also great");

        System.out.println("Waiting for thread to finish work");
        th.join();
    }
}
