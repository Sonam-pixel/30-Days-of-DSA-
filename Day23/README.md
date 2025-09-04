# 💻 Day 23 of #30DaysOfDSA – LeetCode Beginner Challenge

## 🔹 Topic: Simulation / Math  
**Today’s Problem:** [412. Fizz Buzz](https://leetcode.com/problems/fizz-buzz/)  

---

## 📌 Problem Summary
Given an integer `n`, return a string array answer (1-indexed) where:
- `answer[i] = "FizzBuzz"` if `i` is divisible by 3 and 5.  
- `answer[i] = "Fizz"` if `i` is divisible by 3.  
- `answer[i] = "Buzz"` if `i` is divisible by 5.  
- `answer[i] = i` (as a string) otherwise.  

This is a **classic warm-up problem** that tests iteration, modulus usage, and conditional checks.  

---

## 🛠 Concepts Used
- Simulation / Iteration  
- Modulus operator `%`  
- Conditional checks (`if-else` ladder)  

---

## 💡 Approach
1. Initialize an empty list `result`.  
2. Loop from 1 → n.  
3. For each number:  
   - If divisible by both 3 & 5 → add `"FizzBuzz"`.  
   - Else if divisible by 3 → add `"Fizz"`.  
   - Else if divisible by 5 → add `"Buzz"`.  
   - Else → add the number as a string.  
4. Return the final list.  

---

## ⏱ Complexity
- **Time Complexity:** O(n)  
- **Space Complexity:** O(n) (for storing results)  

---

## 🗂️ GitHub Repository
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway
This problem highlights how **simple conditions + iteration** can solve simulation-based tasks.  
A key point: **always check the combined condition (`% 3 && % 5`) first** to avoid wrong results.  

---

## 📍 Tomorrow’s Problem
**Day 24:** Moving on to another Simulation problem ➡️ [58. Length of Last Word](https://leetcode.com/problems/length-of-last-word/) 🚀  
