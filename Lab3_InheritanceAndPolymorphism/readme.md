# Lab 3: Inheritance & Polymorphism

**Course:** Embedded Systems Electronics (ESE), Master's Program  
**Department:** Electronics, Faculty of Electrical Engineering  
**Institution:** University of Science and Technology of Oran – Mohamed Boudiaf (USTO-MB)  
**Academic Year:** 2021–2022  

## Overview
In this lab, you will explore object-oriented design by leveraging inheritance and polymorphism. You will model task processing using abstract classes and concrete subclasses, demonstrating code reuse and dynamic binding.

## Learning Outcomes
By completing this lab, you will be able to:
1. Define abstract classes and methods in Java.  
2. Create concrete subclasses that extend and implement abstract behaviors.  
3. Utilize polymorphism to process heterogeneous objects through a common interface.  
4. Design and test stack (pile) and queue (file) data structures using inheritance.

## Tasks
1. **Class Hierarchy Design**  
   - Create an abstract class `Tache` with:
     - A protected `String nom` field.
     - An abstract method `void execute()`.
     - A constructor to initialize `nom`.
     - A `toString()` override to display task name.

   - Implement concrete subclasses:
     - `CpuTask` (e.g., computations).
     - `IOTask` (e.g., simulated I/O operations).
     - Each subclass implements `execute()` with a simple print statement.

2. **Data Structures**  
   - Develop an abstract generic class `ListeTache<T extends Tache>`:
     - Internal array or `ArrayList` to store `Tache` references.
     - Methods: `void ajout(T t)`, `T remove()`.
   
   - Derive `Pile` (stack) and `File` (queue) classes from `ListeTache`:
     - `Pile` uses LIFO behavior.
     - `File` uses FIFO behavior.

3. **Processor Class**  
   - Create a `Processeur` class with a `main` method that:
     - Instantiates a `Pile` and a `File` of tasks.
     - Adds a mix of `CpuTask` and `IOTask` to both.
     - Processes all tasks by repeatedly invoking `execute()` on removed tasks.
     - Demonstrates polymorphic behavior at runtime.

4. **Analysis & Discussion**  
   - Explain how inheritance promotes code reuse.  
   - Discuss the role of polymorphism in handling different `Tache` types uniformly.  
   - Compare stack vs. queue behavior in task processing.

## Prerequisites
- Java SE Development Kit (JDK 8 or later)  
- Understanding of Java inheritance, abstract classes, and generics

## Setup & Execution
```bash
# From the lab root directory
cd Lab3_InheritanceAndPolymorphism/src

# Compile all classes
javac Tache.java CpuTask.java IOTask.java ListeTache.java Pile.java File.java Processeur.java

# Run the processor
java Processeur
````

## Expected Results

* Console output showing task addition and execution order for both stack and queue.
* Evidence of dynamic method dispatch (polymorphism).

**Sample Output**:

```
Adding tasks to Pile...
Executing on Pile:
IOTask: Read sensor data
CpuTask: Calculate FFT
...

Adding tasks to File...
Executing on File:
CpuTask: Calculate FFT
IOTask: Read sensor data
...
```

## Deliverables

* Source files for all classes (`Tache`, `CpuTask`, `IOTask`, `ListeTache`, `Pile`, `File`, `Processeur`).
* A Markdown report covering:

  * Class hierarchy design and UML diagram.
  * Polymorphism and abstraction discussion.
  * Comparison of stack vs. queue task processing.
