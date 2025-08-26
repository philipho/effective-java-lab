## Summary
- Stateless function
    - Instead of a static function, which cannot be modified/swapped for future upgrade of the function or for testing.
- Only one instance in the application
    - e.g. database manager, printer, controller

I think the "stateless function" is quite interesting, as utility functions are usually static class methods, e.g. Collections, rather than instance methods.

### Bad
- Impossible to test client interaction as it's almost always returned a pre-created instance using getInstance() method, for example.
    - To get around it, the singleton **should** implement a service interface so that a mock can be used.
  
### Tips
Using ***enum*** is a good option, e.g.
<pre>
    public enum BasicOperation implements Operation {
        ADD { // override methods in Operation },
        SUBTRACT { // ditto },
        MULTIPLY { // ditto },
        DIVIDE { // ditto }
    }
</pre>

- One instance per ADD/SUBTRACT/MULTIPLY/DIVIDE
- It is thread-safe, guaranteed by the JVM
- It is serialisation safe
- IT is reflection-safe, i.e. cannot create another instance by reflection

## Others tips
- Java resolves static function call at compile time by looking at the reference type of the assigned variable.
- Static method is not inherited. 
- If a Child has a static function with the exact same name and signature as in the Parent, the Child static function ***hides*** the Parent's static function.

    <pre>
        Parent p = new Child();
        p.parentStaticFunction() // will call parent's static function even though the real type is Child
  
        var p = new Child();
        p.parentStaticFunction() // will call child's static function cos var is inferred to be a Child
    </pre>