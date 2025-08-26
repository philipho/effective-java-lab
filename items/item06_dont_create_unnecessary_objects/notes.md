## Summary
- don't create redundant objects
- See if an object can be reused
  - `Boolean.valueOf(String)` instead of `new Boolean(String)`
- Map.keySet() returns the same set object of map keys, not creating a new set everytime it's called.

### Tips
- set1 == set2 check if they are the same object, i.e. identity comparison.
- set1.equals(set) checks if they contain the same items, i.e. value comparison.