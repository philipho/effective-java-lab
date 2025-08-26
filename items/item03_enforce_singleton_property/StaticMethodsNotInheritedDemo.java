package item03_enforce_singleton_property;

public class StaticMethodsNotInheritedDemo {

    static class StaticMethodsClass {
        public static void printMe() {
            System.out.println("this is StaticMethodsClass.printMe()");
        }

        public void printMsg(String msg) {
            System.out.println("StaticMethodsClass.printMsg: msg=" + msg);
        }
    }

    static class ChildStaticMethodsClass extends StaticMethodsClass {
        public static void printMe() {
            System.out.println("this is ChildStaticMethodsClass.printMe()");
        }

        @Override
        public void printMsg(String msg) {
            System.out.println("ChildStaticMethodsClass.printMsg: msg=" + msg);
        }
    }

    //--------- Test
    public static void main(String[] args) {
        StaticMethodsClass c1 = new StaticMethodsClass();
        StaticMethodsClass.printMe();
        c1.printMsg("this is c1");

        // Static method is resolved at compile time by looking at the reference type
        // In this case c2 is StaticMethodClass, so it calls parent.printMe()
        StaticMethodsClass c2 = new ChildStaticMethodsClass();
        c2.printMe();
        c2.printMsg("this is c2");

        // Java infers the type from the new'ed object
        // i.e. ChildStaticMethodsClass, so it calls child.printMe()
        var c3 = new ChildStaticMethodsClass();
        c3.printMe();
    }
}
