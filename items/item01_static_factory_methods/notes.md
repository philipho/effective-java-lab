# Item 1 — Consider static factory methods instead of constructors

## Summary
Static factory methods can be more descriptive, cacheable, and flexible than constructors.
They can:
- Have meaningful names (`from`, `of`, `valueOf`)
- Return any subtype of their return type
- Potentially avoid creating new objects

## Bad
- Forces creation of new objects every time.
- Can only return the exact class type.

## Good
- Can return cached instances (e.g., Boolean.valueOf)
- More descriptive method names.

---

### References
- [Bloch, Effective Java 3rd Edition, Item 1]
- Example in JDK: `Integer.valueOf(int)`
