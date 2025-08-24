package item03_enforce_singleton_property;

public enum EnumPrinter implements Printer {
    INSTANCE;

    @Override
    public void print(String msg) {
        System.out.println("EnumPrinter.print: " + msg);
    }

    @Override
    public String getName() {
        return "EnumPrinter";
    }

    //------ test
    public static void main(String[] args) {
        Printer printer = EnumPrinter.INSTANCE;
        printer.print("haha, this is simple and efficent, due to JVM synchrionization, no threading issue, no serialization and reflection issues");
    }
}
