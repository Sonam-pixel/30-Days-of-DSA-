# 💻 Day 17 of #30DaysOfDSA – LeetCode Beginner Challenge

## 🔹 Topic: Sorting  
**Today’s Problem:** [561. Array Partition](https://leetcode.com/problems/array-partition/)  

---

## 📌 Problem Summary
You are given an integer array `nums` of `2n` elements.  
You need to group these elements into `n` pairs `(a, b)` such that the **sum of the minimums of each pair** is maximized.  

---

## 🛠 Concepts Used
- Sorting  
- Greedy approach  
- Pair selection strategy  

---

## 💡 Approach
1. Sort the array in ascending order.  
2. Pair elements as `(nums[0], nums[1])`, `(nums[2], nums[3])`, …  
3. For each pair, take the smaller element (which will always be at even index after sorting).  
4. Sum up all these minimums to get the maximum possible result.  

---

## ⏱ Complexity
- **Time Complexity:** O(n log n) (due to sorting)  
- **Space Complexity:** O(1) (ignoring input/output storage)  

---

## 🗂️ GitHub Repository
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway
This problem shows how combining **sorting** with a **greedy pairing strategy** helps achieve the optimal solution in a simple manner. Pairing adjacent numbers ensures maximum contribution from the minimums.  

---

## 📍 Tomorrow’s Problem
**Day 18:** Start with Math ➡️ [7. Reverse Integer](https://leetcode.com/problems/reverse-integer/) 🚀  
