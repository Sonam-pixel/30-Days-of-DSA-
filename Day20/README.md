# 💻 Day 20 of #30DaysOfDSA – LeetCode Beginner Challenge

## 🔹 Topic: Math / Bit Manipulation  
**Today’s Problem:** [231. Power of Two](https://leetcode.com/problems/power-of-two/)  

---

## 📌 Problem Summary
Given an integer `n`, determine if it is a power of two.  
A number is a power of two if it can be written as `2^k` where `k ≥ 0`.  

---

## 🛠 Concepts Used
- Bitwise operations  
- Logarithmic properties  
- Edge case handling (`n ≤ 0`)  

---

## 💡 Approach
1. If `n <= 0`, return `false`.  
2. Use the property: **a power of two has exactly one bit set in binary form.**  
   - Check using `(n & (n - 1)) == 0`.  
3. Alternatively, repeatedly divide `n` by 2 until it reaches 1.  

---

## ⏱ Complexity
- **Time Complexity:** O(1) using bitwise method, O(log n) using division  
- **Space Complexity:** O(1)  

---

## 🗂️ GitHub Repository
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway
This problem reinforces how **bit manipulation** can simplify mathematical checks.  
Recognizing **binary patterns** is a powerful skill for efficient problem-solving.  

---

## 📍 Tomorrow’s Problem
**Day 21:** Continue with Math ➡️ [171. Excel Sheet Column Number](https://leetcode.com/problems/excel-sheet-column-number/) 🔢  
