# 💻 Day 27 of #30DaysOfDSA – LeetCode Beginner Challenge

## 🔹 Topic: String Matching  
**Today’s Problem:** [28. Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)  

---

## 📌 Problem Summary
Given two strings `haystack` and `needle`, return the **index of the first occurrence** of `needle` in `haystack`.  
If `needle` is not part of `haystack`, return `-1`.  

- Example 1:  
  Input: `haystack = "sadbutsad"`, `needle = "sad"`  
  Output: `0`  

- Example 2:  
  Input: `haystack = "leetcode"`, `needle = "leeto"`  
  Output: `-1`  

This problem evaluates the understanding of **string traversal and substring comparison**.  

---

## 🛠 Concepts Used
- String traversal  
- Substring comparison  
- Brute-force search  
- Index handling  

---

## 💡 Approach
1. Loop through `haystack` until `haystack.length - needle.length`.  
2. At each position, extract a substring of length `needle.length`.  
3. If the substring matches `needle`, return the starting index.  
4. If no match is found, return `-1`.  

---

## ⏱ Complexity
- **Time Complexity:** O((n - m + 1) × m), where `n = haystack.length` and `m = needle.length`  
- **Space Complexity:** O(1)  

---

## 🗂️ GitHub Repository
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway
String problems often test **careful index management**.  
While built-in functions (like `indexOf`) exist, manually implementing substring search **strengthens logic-building** and deepens understanding of pattern matching.  

---

## 📍 Tomorrow’s Problem
**Day 28:** Continue string challenges ➡️ [38. Count and Say](https://leetcode.com/problems/count-and-say/) 🔢  
