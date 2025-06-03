# DynamicArray

This project implements a data structure called `DynamicArray` in Java, similar to a dynamic array, with support for custom iteration.

## Project Structure
- `DynamicArray.java`: Implementation of the dynamic data structure.
- `MyIterator.java`: Implementation of a custom iterator for the `DynamicArray`.
- `Main.java`: Main class to test and demonstrate the usage of `DynamicArray` and the iterator.

## How to Run
1. Compile all Java files:
   ```sh
   javac src/*.java
   ```
2. Run the main class:
   ```sh
   java -cp src Main
   ```

## Usage Example
```java
Integer[] array = {1, 2, 3, 4, 5};
DynamicArray dc = new DynamicArray(array);
MyIterator iterator = (MyIterator) dc.iterator();
dc.remove(2); // Removes the element at index 2
```

## Author
Sample project for studying data structures in Java.

