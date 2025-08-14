# 💻 Day 4 of 30 Days of DSA – LeetCode Beginner Challenge

## 🔹 Topic: Matrix Manipulation
**Problem:** [73. Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/)  

---

## 📌 Problem Summary
Given an `m × n` matrix, if an element is 0, set its entire row and column to 0.  
Do it **in-place** without using extra space proportional to the matrix size.

---

## 🛠 Concepts Used
- Matrix traversal
- Marker technique using the first row & first column
- In-place modification to optimize space

---

## 💡 My Approach
1. **First Pass:** Traverse the matrix to find zero elements.  
   Use the **first row and first column as markers** to store zero positions.
2. **Second Pass:** Update the matrix using these markers.
3. **Final Step:** Handle the first row and column separately to avoid overwriting markers too early.

---

## ⏱ Time & Space Complexity
- **Time Complexity:** `O(m × n)`  
- **Space Complexity:** `O(1)` (in-place solution)

---

## 📂 GitHub Repository
👉🏻 [30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)

---

## ✅ Key Takeaway
This problem teaches how **marker arrays can be simulated** within the given matrix to save space.  
Learning to **store extra info smartly** inside the given data structure is a key DSA skill!

---

## 📍 Tomorrow’s Problem
Moving to: **[498. Diagonal Traverse](https://leetcode.com/problems/diagonal-traverse/)**

