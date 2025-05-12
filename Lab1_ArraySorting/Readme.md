# Lab 1: Array Manipulation & Sorting

**Course:** Embedded Systems Electronics (ESE), Master's Program  
**Department:** Electronics, Faculty of Electrical Engineering  
**Institution:** University of Science and Technology of Oran – Mohamed Boudiaf (USTO-MB)  
**Academic Year:** 2021–2022  
**Lab Author:** Mlle AARIZOU

## Overview
In this lab, you will gain hands-on experience with Java by working directly with arrays and implementing three fundamental sorting algorithms. You will learn how to:
- Read and validate command-line input.  
- Store and manipulate data in arrays.  
- Analyze and compare algorithmic performance.

## Learning Outcomes
By the end of this lab, you should be able to:
1. Parse and validate integer inputs passed as command-line arguments.  
2. Implement Selection Sort, Insertion Sort, and Bubble Sort in Java.  
3. Measure and discuss the time complexity of each algorithm under different input conditions.

## Tasks
1. **Environment Setup & Input Handling**  
   - Create three Java classes: `TriSelection.java`, `TriInsertion.java`, and `TriBubble.java`.  
   - In each `main` method, print the number of received arguments.  
   - Convert arguments to integers, handling invalid input with descriptive error messages.
2. **Algorithm Implementation**  
   - **Selection Sort**: Locate the minimum element from the unsorted portion and swap it into place.  
   - **Insertion Sort**: Build the sorted subarray by inserting each new element into its proper position.  
   - **Bubble Sort**: Repeatedly swap adjacent out-of-order elements until the array is sorted.
3. **Execution & Analysis**  
   - Compile and run each program with varied data sets (random, sorted, reverse-sorted).  
   - (Optional) Capture execution times to illustrate best-, average-, and worst-case scenarios.  
   - Document observations on performance and discuss theoretical time and space complexity.

## Prerequisites
- Java SE Development Kit (JDK 8 or later)  
- Fundamental understanding of Java syntax, arrays, and control structures

## Setup & Execution
```bash
# From the lab root directory
cd Lab1_ArraySorting/src

# Compile all classes
javac TriSelection.java TriInsertion.java TriBubble.java

# Example runs
java TriSelection 9 4 7 1 3
java TriInsertion 9 4 7 1 3
java TriBubble 9 4 7 1 3
````

## Expected Results

Each program will output:

1. **Argument Count**: Number of integers received.
2. **Sorted Array**: Elements printed in ascending order.

**Sample Output**:

```
Number of arguments: 5
Sorted array:
1 3 4 7 9
```

## Deliverables

* Source files for `TriSelection`, `TriInsertion`, and `TriBubble`.
* A Markdown report summarizing:

  * Algorithm descriptions and pseudocode.
  * Time and space complexity analysis.
  * Comparative performance observations.
