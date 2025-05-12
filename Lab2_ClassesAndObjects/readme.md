# Lab 2: Classes & Objects

**Course:** Embedded Systems Electronics (ESE), Master's Program  
**Department:** Electronics, Faculty of Electrical Engineering  
**Institution:** University of Science and Technology of Oran – Mohamed Boudiaf (USTO-MB)  
**Academic Year:** 2021–2022  

## Overview
In this lab, you will apply object-oriented principles in Java by designing and implementing a custom list class. You will gain experience with:
- Defining classes, fields, and methods.  
- Encapsulating data and enforcing invariants.  
- Interacting with objects via a test harness (main method).

## Learning Outcomes
By completing this lab, you will be able to:
1. Design a Java class with private fields and public methods.  
2. Implement constructors, accessors, and mutators following best practices.  
3. Manage internal state and validate method inputs.  
4. Write a driver program to test your class functionality.

## Tasks
1. **Class Design**  
   - Create a class named `Liste` in `Liste.java`.  
   - Use an internal array to store integer elements.  
   - Define a constant `MAX_SIZE` for the maximum capacity.  
   - Provide a default constructor to initialize an empty list.

2. **Method Implementation**  
   - `void ajout(int x)`: Append element `x` to the end of the list; throw an exception if full.  
   - `int taille()`: Return the current number of elements.  
   - `int get(int index)`: Return the element at `index`; validate bounds.  
   - `void supprime(int index)`: Remove the element at `index`, shifting subsequent elements left.  
   - `boolean contient(int x)`: Check whether `x` exists in the list.

3. **Test Harness**  
   - Create a class `Tp2` with a `main` method.  
   - Instantiate `Liste`, perform a sequence of adds and removes.  
   - Display list contents after each operation.  
   - Handle and report any exceptions gracefully.

4. **Analysis & Discussion**  
   - Discuss the time complexity of each operation (add, remove, search).  
   - Reflect on how capacity limits affect design.  
   - Suggest improvements (e.g., dynamic resizing).

## Prerequisites
- Java SE Development Kit (JDK 8 or later)  
- Familiarity with Java classes, arrays, and exceptions

## Setup & Execution
```bash
# From the lab root directory
cd Lab2_ClassesAndObjects/src

# Compile classes
javac Liste.java Tp2.java

# Run the test program
java Tp2
````

## Expected Results

* Output showing the list size and elements after each operation.
* Clear error messages if trying to exceed capacity or access invalid indices.

**Sample Output**:

```
Initial list: []
After about(5): [5]
After ajout(3): [5, 3]
After supprime(0): [3]
Contains 3? true
Current size: 1
```

## Deliverables

* `Liste.java` and `Tp2.java` source files.
* A Markdown report covering:

  * Class design rationale.
  * Method descriptions and complexity analysis.
  * Test case results and observations.
