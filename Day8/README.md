# 💻 Day 8 of #30DaysOfDSA – LeetCode Beginner Challenge

## 🔹 Topic: Binary Search (Application)  
**Today’s Problem:** [278. First Bad Version](https://leetcode.com/problems/first-bad-version/)  

---

## 📌 Problem Summary
You are given `n` versions of a product, where some versions are good and the later ones are bad.  
Your task is to **find the first bad version** which makes all following versions bad.  
You can only use the given API: `isBadVersion(version)` and must minimize API calls.

---

## 🛠 Concepts Used
- Binary Search  
- Divide and Conquer Optimization  
- API-based Decision Making  

---

## 💡 Approach
1. Initialize pointers: `left = 1`, `right = n`.  
2. While `left < right`:  
   - Compute `mid = (left + right) / 2`.  
   - If `isBadVersion(mid)` is **true** → the first bad version is at `mid` or before it → move `right = mid`.  
   - Else → move `left = mid + 1`.  
3. When the loop ends, `left == right`, which is the **first bad version**.  

---

## ⏱ Complexity
- **Time Complexity:** O(log n)  
- **Space Complexity:** O(1)  

---

## 🗂️ GitHub Repository
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway
Binary Search is not limited to arrays – it’s powerful for any problem where a **monotonic (sorted-like) property** exists.  
Here, once a version is bad, all later ones are bad, which makes it a perfect use case for binary search.  

---

## 📍 Tomorrow’s Problem
**Day 9:** Problem **69 – Sqrt(x)** 🚀
