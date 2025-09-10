# 💻 Day 29 of #30DaysOfDSA – LeetCode Beginner Challenge  

## 🔹 Topic: Number Theory / Hashing  
**Today’s Problem:** [202. Happy Number](https://leetcode.com/problems/happy-number/)  

---

## 📌 Problem Summary  
A **happy number** is defined as follows:  
- Start with any positive integer.  
- Replace the number with the **sum of the squares of its digits**.  
- Repeat the process until the number becomes **1 (happy)** or **loops endlessly (unhappy)**.  
- Return `true` if the number is happy, otherwise `false`.  

---

## 🛠 Concepts Used  
- Cycle detection in sequences  
- HashSet for tracking visited numbers  
- Math operations on digits  

---

## 💡 Approach  
1. Initialize a **HashSet** to store visited numbers.  
2. Compute the **sum of squares of digits** for the current number.  
3. If the number becomes `1` → return `true`.  
4. If the number repeats (appears in the set) → return `false` (cycle detected).  
5. Continue until a result is found.  

---

## ⏱ Complexity  
- **Time Complexity:** O(log n) per step (digit extraction is logarithmic)  
- **Space Complexity:** O(log n) due to HashSet storage  

---

## 🗂️ GitHub Repository  
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway  
This problem is a great example of **cycle detection in number transformations**.  
It can be solved efficiently using a **HashSet** or with **Floyd’s Cycle Detection algorithm** (tortoise and hare).  

---

## 📍 Tomorrow’s Problem  
**Day 30:** Move to bit manipulation ➡️ [136. Single Number](https://leetcode.com/problems/single-number/) 🔄  

