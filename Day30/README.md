# 💻 Day 30 of #30DaysOfDSA – LeetCode Beginner Challenge 🎉  

## 🔹 Topic: Bit Manipulation  
**Today’s Problem:** [136. Single Number](https://leetcode.com/problems/single-number/)  

---

## 📌 Problem Summary  
Given a non-empty array of integers where **every element appears twice except for one**, find that single unique element.  

---

## 🛠 Concepts Used  
- XOR properties (`a ^ a = 0`, `a ^ 0 = a`)  
- Bitwise manipulation for constant space solution  
- Array traversal  

---

## 💡 Approach  
1. Initialize a variable `result = 0`.  
2. Traverse through the array and apply XOR: `result ^= num`.  
3. Since duplicates cancel out, the remaining `result` will hold the unique number.  

---

## ⏱ Complexity  
- **Time Complexity:** O(n) (linear scan through array)  
- **Space Complexity:** O(1) (no extra data structures needed)  

---

## 🗂️ GitHub Repository  
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway  
This problem beautifully demonstrates the **power of XOR** in bit manipulation.  
Instead of using extra memory (like HashMap/Set), XOR gives an elegant and efficient solution in **constant space**.  

---

## ✨ Special Note  
This marks the **final day (Day 30)** of my #30DaysOfDSA challenge 🚀.  
Over the past month, I explored:  
✅ Matrix  
✅ Binary Search  
✅ Sorting  
✅ Math  
✅ Simulation  
✅ Bit Manipulation  

Consistency truly pays off — this challenge helped me strengthen my problem-solving mindset and build confidence step by step.  
