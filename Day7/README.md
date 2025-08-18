# 💻 Day 7 of #30DaysOfDSA – LeetCode Beginner Challenge

## 🔹 Topic: Binary Search  
**Today’s Problem:** [704. Binary Search](https://leetcode.com/problems/binary-search/)

---

## 📌 Problem Summary
Given a **sorted array of integers** and a target value, return its index using **Binary Search**.  
If the target is not found, return `-1`.

---

## 🛠 Concepts Used
- Divide and Conquer  
- Searching in Sorted Arrays  
- Mid-point Calculation  

---

## 💡 Approach
1. Initialize two pointers: `left = 0`, `right = n-1`.  
2. While `left <= right`:  
   - Compute `mid = (left + right) / 2`.  
   - If `nums[mid] == target` → return `mid`.  
   - If `nums[mid] > target` → search **left half**.  
   - Else → search **right half**.  
3. Return `-1` if not found.  

---

## ⏱ Complexity
- **Time Complexity:** O(log n)  
- **Space Complexity:** O(1)  

---

## 🗂️ GitHub Repository
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway
Binary Search is the foundation of **efficient searching**.  
Always remember: it **only works on sorted data**!  
Mastering this unlocks many advanced algorithms.

---

## 📍 Tomorrow’s Problem
**Day 8:** Problem **278 – First Bad Version** 🚀
