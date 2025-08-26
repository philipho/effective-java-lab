## Summary
- Don't use "new"
- Use constructor dependency injection
- Use Java 8 Supplier<? extends T> as an interface for a factory

### Tips
- Methods that take a ***Supplier\<T>*** on input should typically constrain the factory’s type parameter using a ***bounded wildcard type*** to allow the client to pass in a factory that creates any subtype of a specified type.