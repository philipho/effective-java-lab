package item02_builder_pattern;


public class GoodExample {
    static class Person {
        private final String name;
        private final int age;
        private int ssi; // Social Security ID

        public Person(PersonBuilder builder) {
            this.name = builder.name;
            this.age = builder.age;
            this.ssi = builder.ssi;
        }

        @Override
        public String toString() {
            return String.format("name=%s, age=%d, ssi=%d", name, age, ssi);
        }

        static class PersonBuilder {
            private final String name;
            private final int age;
            private int ssi = 0;

            // Mandatory fields must be initialised
            public PersonBuilder(String name, int age) {
                this.name = name;
                this.age = age;
            }

            // Optional field
            public PersonBuilder ssi(int ssi) {
                this.ssi = ssi;
                return this;
            }

            public Person build() {
                return new Person(this);
            }
        }
    }

    public static void main(String[] args){
        Person.PersonBuilder builder = new Person.PersonBuilder("John", 37);
        Person john = builder.ssi(20710843).build();
        System.out.println("John is " + john);

        Person.PersonBuilder builder2 = new Person.PersonBuilder("Peter", 27);
        Person peter = builder2.build();
        System.out.println("Peter is " + peter);
    }
}
