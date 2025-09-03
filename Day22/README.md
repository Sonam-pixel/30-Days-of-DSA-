# 💻 Day 22 of #30DaysOfDSA – LeetCode Beginner Challenge

## 🔹 Topic: Math / String to Number Conversion  
**Today’s Problem:** [13. Roman to Integer](https://leetcode.com/problems/roman-to-integer/)  

---

## 📌 Problem Summary
Convert a Roman numeral string (like `"III"`, `"IV"`, `"IX"`, `"LVIII"`, `"MCMXCIV"`) into its corresponding integer value.  
The challenge lies in handling **subtractive rules** (e.g., `IV = 4`, `IX = 9`) along with the standard additive cases.  

---

## 🛠 Concepts Used
- HashMap for Roman symbol → value mapping  
- Iterative string traversal  
- Subtractive rule handling (checking next symbol)  

---

## 💡 Approach
1. Store Roman numeral values in a map (`I=1`, `V=5`, `X=10`, `L=50`, `C=100`, `D=500`, `M=1000`).  
2. Traverse the string from **left to right**.  
3. If the **current symbol < next symbol**, subtract its value from the result.  
4. Otherwise, add it to the result.  
5. Continue until all characters are processed.  

---

## ⏱ Complexity
- **Time Complexity:** O(n), where `n` = length of the Roman numeral  
- **Space Complexity:** O(1)  

---

## 🗂️ GitHub Repository
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway
This problem teaches how to handle **special subtractive cases** in numeral systems.  
A simple **"look ahead to the next symbol"** strategy makes the implementation clean and efficient.  

---

## 📍 Tomorrow’s Problem
**Day 23:** Moving on to Simulation ➡️ [412. Fizz Buzz](https://leetcode.com/problems/fizz-buzz/) 🚀  
