# 💻 Day 19 of #30DaysOfDSA – LeetCode Beginner Challenge

## 🔹 Topic: Math / Binary Operations  
**Today’s Problem:** [67. Add Binary](https://leetcode.com/problems/add-binary/)  

---

## 📌 Problem Summary
Given two binary strings `a` and `b`, return their sum as a binary string.  

---

## 🛠 Concepts Used
- String manipulation  
- Binary addition rules (`0+0=0`, `1+0=1`, `1+1=0` with carry)  
- Carry handling in addition  
- Iteration from right to left  

---

## 💡 Approach
1. Start from the last digit of both strings.  
2. Add corresponding digits and the carry.  
3. Store the least significant bit of the result and update the carry.  
4. Continue until both strings and the carry are processed.  
5. Reverse the final result to get the correct binary sum.  

---

## ⏱ Complexity
- **Time Complexity:** O(max(m, n))  
- **Space Complexity:** O(max(m, n))  

---

## 🗂️ GitHub Repository
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway
This problem highlights the importance of simulating **manual addition logic** in programming.  
Breaking it into **carry + digit steps** makes binary operations much easier to implement.  

---

## 📍 Tomorrow’s Problem
**Day 20:** Continue with Math ➡️ [231. Power of Two](https://leetcode.com/problems/power-of-two/) ⚡  
