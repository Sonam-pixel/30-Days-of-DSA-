# 💻 Day 13 of #30DaysOfDSA – LeetCode Beginner Challenge

## 🔹 Topic: Sorting (Index Placement)  
**Today’s Problem:** [922. Sort Array By Parity II](https://leetcode.com/problems/sort-array-by-parity-ii/)  

---

## 📌 Problem Summary
Given an array of even length where **half of the integers are even and half are odd**, rearrange it so that:  
- Elements at **even indices** are even  
- Elements at **odd indices** are odd  

---

## 🛠 Concepts Used
- Two-pointer technique (separate pointers for even and odd indices)  
- Modulo operation for parity check  
- In-place swapping  

---

## 💡 Approach
1. Initialize two pointers:  
   - `even = 0` (start of array, step +2)  
   - `odd = 1` (second position, step +2)  
2. Traverse the array:  
   - If `nums[even]` is odd and `nums[odd]` is even → **swap them**.  
   - Otherwise, move the pointers ahead by `+2`.  
3. Continue until both pointers cross the array length.  
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
This problem highlights how **simple index-based pointer traversal** can efficiently fix misplaced elements without needing extra space.  

---

## 📍 Tomorrow’s Problem
**Day 14:** Continue with Sorting ➡️ [977. Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/) 🚀  
