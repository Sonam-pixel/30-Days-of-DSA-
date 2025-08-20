# 💻 Day 9 of #30DaysOfDSA – LeetCode Beginner Challenge

## 🔹 Topic: Binary Search (Application)  
**Today’s Problem:** [69. Sqrt(x)](https://leetcode.com/problems/sqrtx/)  

---

## 📌 Problem Summary
You are given a non-negative integer `x`, and you need to return the **integer part of its square root** (truncate the decimal).  
You cannot use built-in functions like `sqrt()`.

---

## 🛠 Concepts Used
- Binary Search  
- Mid-point Calculation  
- Overflow Handling (`mid * mid ≤ x`)  

---

## 💡 Approach
1. Initialize pointers: `left = 0`, `right = x`.  
2. While `left ≤ right`:  
   - Compute `mid = (left + right) / 2`.  
   - If `mid * mid == x` → return `mid`.  
   - If `mid * mid < x` → store `mid` as possible answer, move `left = mid + 1`.  
   - Else → move `right = mid - 1`.  
3. Return the stored answer (floor of sqrt).  

---

## ⏱ Complexity
- **Time Complexity:** O(log x)  
- **Space Complexity:** O(1)  

---

## 🗂️ GitHub Repository
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway
Binary Search is not limited to arrays – it can be applied on **search spaces** like square roots to reduce computation efficiently.  
This makes problems solvable in logarithmic time instead of linear/brute force.  

---

## 📍 Tomorrow’s Problem
**Day 10:** Problem **744 – Find Smallest Letter Greater Than Target** ➡️
