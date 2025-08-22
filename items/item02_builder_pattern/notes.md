## Summary
- A builder is usually a static class of the class to be built.
- The builder's ctor compose of all **REQUIRED** params
- Optional params have default values
- Optional params can be initialised as needed

### Good
- Remove the need of telescopic constructors
- Avoid JavaBean style initialisation which can leave an object in a non-fully initialised state