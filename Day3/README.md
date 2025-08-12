# 🚀 Day 3 – 30 Days of DSA: LeetCode Beginner Challenge

**Topic:** Matrix Traversal  
**Problem:** [54. Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)  

---

## 📌 Problem Summary
Given an `m × n` matrix, return all elements in **spiral order** — starting from the top-left corner, moving right, then down, then left, and up, repeating until all elements are visited.

---

## 🛠 Concepts Used
- 2D array traversal  
- Four-pointer boundary method (`top`, `bottom`, `left`, `right`)  
- Conditional loops to avoid duplicates

---

## 💡 My Approach
1. Initialize four boundaries: **top, bottom, left, right**.  
2. Traverse:
   - Left → Right (**top row**)
   - Top → Bottom (**right column**)
   - Right → Left (**bottom row**)
   - Bottom → Top (**left column**)
3. After each direction, **shrink the boundaries**.
4. Repeat until all elements are visited.

---

## ⏱ Time & Space Complexity
- **Time Complexity:** `O(m × n)`  
- **Space Complexity:** `O(1)` (excluding result list)

---

## 🗂 GitHub Repository
🔗 [View Code Here](https://github.com/Sonam-pixel/30-Days-of-DSA-)

---

## ✅ Takeaway
Breaking the traversal into **clear directional steps** makes it much easier to implement.  
The **key** is updating boundaries **carefully** after each pass to avoid infinite loops or duplicate elements.

---

## 📍 Tomorrow’s Problem
**Day 4:** Problem **73 – Set Matrix Zeroes** 🚀

