## Summary
- Stateless function
    - Instead of static function, which cannot be modified/swapped for future upgrade of the function or for testing.
- Only one instance in application
    - e.g. database manager, printer, controller

I think the "stateless function" is quite interesting as utility functions are usually static class methods, e.g. Collections, rather than instance methods.

### Bad
- Impossible to test client interaction as it's almost always returned a pre-created instance using getInstance() method, for exmaple.
    - To get around it, the singleton **should** implement a service interface so that a mock can be used.
  
### Tips
Use enum is really good, e.g.
<pre>
    public enum BasicOperation implements Operation {
        ADD { // override methods in Operation },
        SUBTRACT { // ditto },
        MULTIPLY { // ditto },
        DIVIDE { // ditto }
    }
</pre>

- One instance per ADD/SUBTRACT/MULTIPLY/DIVIDE
- It is thread safe, guaranteed by JVM
- It is serialization safe
- IT is reflection-safe, i.e. cannot create another instance by reflection