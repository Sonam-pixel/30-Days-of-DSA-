# 💻 Day 6 of #30DaysOfDSA – LeetCode Beginner Challenge

## 🔹 Topic: Matrix Manipulation  
**Today’s Problem:** [566. Reshape the Matrix](https://leetcode.com/problems/reshape-the-matrix/)

---

## 📌 Problem Summary
Given an `m × n` matrix and two integers `r` and `c`, reshape the matrix into a new `r × c` matrix while keeping the original elements in **row-traversing order**.  
If reshaping is not possible, return the original matrix.

---

## 🛠 Concepts Used
- 2D array traversal  
- Flattening & mapping indices  
- Maintaining row-major order

---

## 💡 Approach
1. Check if reshaping is possible (`m × n == r × c`). If not, return the original matrix.  
2. Flatten the original matrix into a 1D list or traverse it with index mapping.  
3. Fill the new `r × c` matrix using the elements in **row-wise order**.  

---

## ⏱ Complexity
- **Time Complexity:** O(m × n)  
- **Space Complexity:** O(r × c) (for the reshaped matrix)  

---

## 🗂️ GitHub Repository
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway
Reshaping matrices becomes simpler if you visualize the matrix as a **flat array** first.  
Mapping indices carefully is key to avoid mistakes.

---

## 📍 Next Up
Tomorrow: A fun problem with **Binary Search**! 🔄
