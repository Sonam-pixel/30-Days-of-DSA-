# 💻 Day 14 of #30DaysOfDSA – LeetCode Beginner Challenge

## 🔹 Topic: Sorting (Two Pointers)  
**Today’s Problem:** [977. Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)  

---

## 📌 Problem Summary
Given a sorted integer array `nums` (which may include negative numbers), return an array of the **squares of each number**, also sorted in non-decreasing order.  

---

## 🛠 Concepts Used
- Two-pointer technique (left & right ends of array)  
- Absolute value comparison  
- Reverse filling of result array  

---

## 💡 Approach
1. Initialize two pointers:  
   - `left = 0` (start of array)  
   - `right = n-1` (end of array)  
2. Create a result array of size `n`.  
3. Compare absolute values of `nums[left]` and `nums[right]`:  
   - Place the **larger square** at the current end of the result array.  
   - Move the corresponding pointer inward.  
4. Repeat until all positions are filled.  
5. Return the result array.  

---

## ⏱ Complexity
- **Time Complexity:** O(n)  
- **Space Complexity:** O(n) (for result array)  

---

## 🗂️ GitHub Repository
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway
This problem demonstrates how the **two-pointer technique** can eliminate the need for re-sorting, allowing us to solve the problem in linear time by leveraging array properties.  

---

## 📍 Tomorrow’s Problem
**Day 15:** Continue with Sorting ➡️ [1051. Height Checker](https://leetcode.com/problems/height-checker/) 🚀  
