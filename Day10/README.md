# 💻 Day 10 of #30DaysOfDSA – LeetCode Beginner Challenge

## 🔹 Topic: Binary Search (Application)  
**Today’s Problem:** [744. Find Smallest Letter Greater Than Target](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)  

---

## 📌 Problem Summary
You are given a sorted array of characters (`letters`) and a target character.  
You need to return the **smallest letter in the array strictly greater than the target**.  

👉 Note: The array is circular, so if the target is greater than or equal to the last letter, the answer is the **first letter**.

---

## 🛠 Concepts Used
- Binary Search  
- Circular Array Handling  
- Mid-point Decision Making  

---

## 💡 Approach
1. Initialize pointers: `left = 0`, `right = n - 1`.  
2. While `left ≤ right`:  
   - Compute `mid = (left + right) / 2`.  
   - If `letters[mid] > target` → move `right = mid - 1` (store as candidate).  
   - Else → move `left = mid + 1`.  
3. Since the array is **circular**, return `letters[left % n]`.  

---

## ⏱ Complexity
- **Time Complexity:** O(log n)  
- **Space Complexity:** O(1)  

---

## 🗂️ GitHub Repository
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway
This problem shows how **binary search works beyond numbers**, applying it to characters.  
The circular condition handling ensures correctness when the target exceeds or equals the last element.  

---

## 📍 Tomorrow’s Problem
**Day 11:** Problem **374 – Guess Number Higher or Lower** ➡️  
