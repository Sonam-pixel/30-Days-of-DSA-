# 💻 Day 11 of #30DaysOfDSA – LeetCode Beginner Challenge

## 🔹 Topic: Binary Search (Application)  
**Today’s Problem:** [374. Guess Number Higher or Lower](https://leetcode.com/problems/guess-number-higher-or-lower/)  

---

## 📌 Problem Summary
You are playing a guessing game. The system picks a number between `1` and `n`.  
You have to guess it using the **guess(int num) API**, which returns:  
- `0` → if the number matches the picked number  
- `-1` → if the picked number is lower than your guess  
- `1` → if the picked number is higher than your guess  

Your task: **Return the picked number using the fewest guesses**.  

---

## 🛠 Concepts Used
- Binary Search  
- Mid-point Calculation  
- API-based Decision Handling  

---

## 💡 Approach
1. Initialize the search range: `left = 1`, `right = n`.  
2. While `left ≤ right`:  
   - Compute `mid = (left + right) / 2`.  
   - Call `guess(mid)`.  
   - If result is `0`, return `mid`.  
   - If result is `-1`, update `right = mid - 1`.  
   - If result is `1`, update `left = mid + 1`.  
3. The loop guarantees finding the picked number in **logarithmic steps**.  

---

## ⏱ Complexity
- **Time Complexity:** O(log n)  
- **Space Complexity:** O(1)  

---

## 🗂️ GitHub Repository
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway
This problem demonstrates how **binary search adapts to interactive guessing games**.  
By halving the search space each time, we efficiently find the target even for very large `n`.  

---

## 📍 Tomorrow’s Problem
**Day 12:** Starting with **Sorting Problems** ➡️  
