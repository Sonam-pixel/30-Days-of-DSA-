# 💻 Day 26 of #30DaysOfDSA – LeetCode Beginner Challenge

## 🔹 Topic: String Manipulation / Two-Pointer  
**Today’s Problem:** [344. Reverse String](https://leetcode.com/problems/reverse-string/)  

---

## 📌 Problem Summary
Write a function that reverses a string. The input string is provided as an array of characters `s`.  
- You must do it **in-place** with **O(1) extra memory**.  
- Example 1: `['h','e','l','l','o'] → ['o','l','l','e','h']`  
- Example 2: `['H','a','n','n','a','h'] → ['h','a','n','n','a','H']`  

This problem tests the efficient use of the **two-pointer technique** for **in-place string manipulation**.  

---

## 🛠 Concepts Used
- Two-pointer technique  
- In-place swapping  
- Array/string traversal  

---

## 💡 Approach
1. Initialize two pointers: `left = 0` and `right = s.length - 1`.  
2. Swap the characters at indices `left` and `right`.  
3. Move the pointers inward: `left++` and `right--`.  
4. Repeat until `left >= right`.  

---

## ⏱ Complexity
- **Time Complexity:** O(n)  
- **Space Complexity:** O(1) *(since modifications are done in-place)*  

---

## 🗂️ GitHub Repository
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway
This problem highlights how the **two-pointer approach** can make string operations memory-efficient.  
A simple **swap trick** avoids the need for extra arrays, keeping the solution clean and optimal.  

---

## 📍 Tomorrow’s Problem
**Day 27:** Another string manipulation task ➡️ [28. Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) 🔄  
