# 🚀 Day 2 – 30 Days of DSA: LeetCode Beginner Challenge

## 🔹 Topic: Matrix  
**Problem:** [867. Transpose Matrix](https://leetcode.com/problems/transpose-matrix/)  

---

## 📌 Problem Summary
Given a 2D matrix, return its **transpose** (flip over its diagonal).  
This means the element at position `(i, j)` moves to `(j, i)`.

---

## 🛠 Concepts Used
- **2D Array Traversal**
- **Index Manipulation** (row ↔ column)
- **Nested Loops**

---

## 💡 My Approach
1. Create a new matrix with swapped dimensions (**rows → columns**, **columns → rows**).
2. Loop through each element of the original matrix.
3. Assign `newMatrix[j][i] = oldMatrix[i][j]`.
4. Return the new matrix.

---

## ⏱ Time & Space Complexity
- **Time Complexity:** `O(m × n)` – Every element is visited once.  
- **Space Complexity:** `O(m × n)` – New matrix created for the result.

---

## 📂 GitHub Repository
🔗 [30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)

---

## ✅ Takeaway
Matrix problems become much simpler once you visualize **row-column swaps**.  
Drawing them out before coding really helps to avoid confusion.

---

## 📍 Tomorrow’s Problem
**54 – Spiral Matrix 🌀**  
Let’s keep the momentum going! 💪

