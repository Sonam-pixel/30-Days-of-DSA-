# 💻 Day 12 of #30DaysOfDSA – LeetCode Beginner Challenge

## 🔹 Topic: Sorting (Two-Pointer / Partitioning)  
**Today’s Problem:** [905. Sort Array By Parity](https://leetcode.com/problems/sort-array-by-parity/)  

---

## 📌 Problem Summary
Given an integer array `nums`, return an array where all even integers appear before all the odd integers.  
The relative order of even or odd numbers within their group **does not matter**.  

---

## 🛠 Concepts Used
- Two-pointer technique  
- In-place partitioning  
- Modulo operation for parity check  

---

## 💡 Approach
1. Initialize two pointers:  
   - `left` starting from index `0`  
   - `right` starting from `nums.length - 1`  
2. While `left < right`:  
   - If `nums[left]` is even → move `left++`  
   - If `nums[right]` is odd → move `right--`  
   - Otherwise → swap `nums[left]` and `nums[right]`  
3. Continue until all even numbers are on the left side.  
4. Return the modified array.  

---

## ⏱ Complexity
- **Time Complexity:** O(n)  
- **Space Complexity:** O(1) (in-place swaps)  

---

## 🗂️ GitHub Repository
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway
This problem demonstrates how the **two-pointer method efficiently partitions arrays**.  
Instead of creating new arrays, **simple in-place swaps** achieve the desired result optimally.  

---

## 📍 Tomorrow’s Problem
**Day 13:** Continue with Sorting ➡️ [922. Sort Array By Parity II](https://leetcode.com/problems/sort-array-by-parity-ii/) 🚀  
