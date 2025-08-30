# 💻 Day 18 of #30DaysOfDSA – LeetCode Beginner Challenge

## 🔹 Topic: Math / Integer Manipulation  
**Today’s Problem:** [7. Reverse Integer](https://leetcode.com/problems/reverse-integer/)  

---

## 📌 Problem Summary
Given a signed 32-bit integer `x`, return the integer with its digits reversed.  
If reversing `x` causes the value to go outside the signed 32-bit integer range  
`[-2³¹, 2³¹ - 1]`, return `0`.  

---

## 🛠 Concepts Used
- Modulo (`%`) and division (`/`) for digit extraction  
- Overflow handling using integer limits  
- Math + edge case consideration  

---

## 💡 Approach
1. Extract the last digit using `digit = x % 10`.  
2. Build the reversed number step by step using `rev = rev * 10 + digit`.  
3. Before updating `rev`, check if it will overflow (`rev > Integer.MAX_VALUE/10` or `< Integer.MIN_VALUE/10`).  
4. Continue until all digits are processed.  

---

## ⏱ Complexity
- **Time Complexity:** O(log₁₀(n)) → proportional to number of digits  
- **Space Complexity:** O(1)  

---

## 🗂️ GitHub Repository
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway
This problem reinforces **digit-by-digit manipulation** and highlights the importance of handling **overflow conditions**.  
Small implementation details like integer limits can make or break the solution in interviews.  

---

## 📍 Tomorrow’s Problem
**Day 19:** Continue with Math ➡️ [67. Add Binary](https://leetcode.com/problems/add-binary/) 🔢🚀  
