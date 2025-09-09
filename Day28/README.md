# 💻 Day 28 of #30DaysOfDSA – LeetCode Beginner Challenge  

## 🔹 Topic: String Construction  
**Today’s Problem:** [38. Count and Say](https://leetcode.com/problems/count-and-say/)  

---

## 📌 Problem Summary
The **Count and Say sequence** is defined as follows:
- Start with `"1"`.  
- For each subsequent term, describe the previous term by **counting consecutive digits**.  

Examples:  
- 1 → `"1"`  
- 2 → `"11"` (one 1)  
- 3 → `"21"` (two 1s)  
- 4 → `"1211"` (one 2, one 1)  

This problem evaluates understanding of **string traversal and run-length encoding**.  

---

## 🛠 Concepts Used
- String traversal  
- Run-length encoding  
- Iterative string building  

---

## 💡 Approach
1. Start with base case `"1"`.  
2. For each iteration up to `n`:  
   - Traverse the current string.  
   - Count consecutive characters.  
   - Build the next string using `"count + digit"`.  
3. Return the final string after completing `n - 1` iterations.  

---

## ⏱ Complexity
- **Time Complexity:** O(n × k), where `k` is the length of the sequence at step `n`  
- **Space Complexity:** O(k) for constructing the new string  

---

## 🗂️ GitHub Repository
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway
This problem highlights how **string construction using grouped counts** can generate patterns.  
Breaking it down step by step makes the logic clear and easier to implement.  

---

## 📍 Tomorrow’s Problem
**Day 29:** Move to number problems ➡️ [202. Happy Number](https://leetcode.com/problems/happy-number/) ✨  
