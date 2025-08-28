# 💻 Day 16 of #30DaysOfDSA – LeetCode Beginner Challenge

## 🔹 Topic: Sorting  
**Today’s Problem:** [1122. Relative Sort Array](https://leetcode.com/problems/relative-sort-array/)  

---

## 📌 Problem Summary
You are given two arrays `arr1` and `arr2`.  
- Sort the elements of `arr1` so that the **relative ordering** of items matches the order in `arr2`.  
- Elements of `arr1` that are **not in `arr2`** should be placed at the end, in **ascending order**.  

---

## 🛠 Concepts Used
- HashMap / Frequency counting  
- Custom sorting based on order mapping  
- Handling remaining elements separately  

---

## 💡 Approach
1. Count the frequency of all elements in `arr1`.  
2. Traverse `arr2`, and for each element, place it in the result according to its frequency.  
3. Collect all remaining elements (not in `arr2`).  
4. Sort the leftover elements in ascending order.  
5. Append them to the result array.  

---

## ⏱ Complexity
- **Time Complexity:** O(n log n) (due to sorting leftover elements)  
- **Space Complexity:** O(n) (for frequency map + result array)  

---

## 🗂️ GitHub Repository
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway
This problem demonstrates how combining **frequency maps** with **custom sorting rules** enables sorting beyond just ascending or descending — making it adaptable to any given order.  

---

## 📍 Tomorrow’s Problem
**Day 17:** Continue with Sorting ➡️ [561. Array Partition](https://leetcode.com/problems/array-partition/) 🌓  
