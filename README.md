# 📈 Tetranacci Sequence Performance Comparison

## Overview

This Java program calculates the **Tetranacci sequence** using two different approaches:
- **Multiple recursion** (naive exponential time)
- **Tail recursion** (linear time)

It compares the performance of each method by writing the results and execution durations to two text files.

---

## 📐 What is Tetranacci?

The Tetranacci sequence is a generalization of the Fibonacci sequence where each term is the sum of the **four** preceding terms:

T(n) = T(n-1) + T(n-2) + T(n-3) + T(n-4)

Initial conditions:
T(0) = 0
T(1) = 0
T(2) = 0
T(3) = 1
T(4) = 1


---

## 🚀 Features

- Implements both **tail-recursive** and **naive recursive** Tetranacci calculations.
- Writes the result of each method to `tetra.txt`.
- Measures and logs execution time in `Duration.txt`.

---

## 📁 Output Files

- `tetra.txt`  
  Contains the actual Tetranacci values calculated by each method.

- `Duration.txt`  
  Shows execution duration (in nanoseconds) for each method at intervals from `T(5)` to `T(35)` in steps of 5.

---

## 💡 Usage

Simply run the program. It will:
1. Compute and log Tetranacci numbers using both approaches.
2. Write values to `tetra.txt` and durations to `Duration.txt`.

Make sure the file paths are writable on your system:
```java
BufferedWriter write = new BufferedWriter(
    new FileWriter("C:\\Users\\YourUsername\\eclipse-workspace\\...\\tetra.txt", false));
