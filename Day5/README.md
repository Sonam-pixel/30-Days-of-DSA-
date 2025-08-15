# 💻 Day 5 – 30 Days of DSA: LeetCode Beginner Challenge

## 🔹 Topic: Matrix Traversal  
**Problem:** [498. Diagonal Traverse](https://leetcode.com/problems/diagonal-traverse/)

---

## 📌 Problem Summary
Given an m × n matrix, return all elements in a **diagonal order** — starting from the top-left, moving along each diagonal in an alternating up-right and down-left pattern.

---

## 🛠 Concepts Used
- 2D array traversal  
- Index manipulation for diagonals  
- Alternating traversal directions  

---

## 💡 Approach
1. Initialize two pointers: `row` and `col`, and a direction flag (`up` or `down`).  
2. Traverse the matrix diagonally:  
   - If moving **up-right**, decrease `row`, increase `col`.  
   - If moving **down-left**, increase `row`, decrease `col`.  
3. Switch direction whenever hitting a boundary and continue until all elements are added to the result array.  

---

## ⏱ Complexity Analysis
- **Time Complexity:** O(m × n)  
- **Space Complexity:** O(m × n) (for the result array)  

---

## 🗂️ GitHub Repository
👉🏻 [30 Days of DSA Repository](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Key Takeaways
Diagonal traversal is all about **managing indices and boundaries carefully**. Visualizing the matrix and drawing the path makes the solution much easier to implement.

---

## 📍 Next Problem
**Problem 566 – Reshape the Matrix** 🧮  
