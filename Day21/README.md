# 💻 Day 21 of #30DaysOfDSA – LeetCode Beginner Challenge

## 🔹 Topic: Math / String to Number Conversion  
**Today’s Problem:** [171. Excel Sheet Column Number](https://leetcode.com/problems/excel-sheet-column-number/)  

---

## 📌 Problem Summary
Given a string column title (like in Excel: `"A"`, `"B"`, ..., `"Z"`, `"AA"`, `"AB"`, ...), return its corresponding column number.  
This follows a **base-26 numbering system** similar to how numbers are represented in decimal.  

---

## 🛠 Concepts Used
- Base-26 number system  
- ASCII character manipulation  
- Iterative string traversal  

---

## 💡 Approach
1. Initialize a result variable as `0`.  
2. For each character in the string:  
   - Convert it to its numeric value using `(ch - 'A' + 1)`.  
   - Update result as: `result = result * 26 + value`.  
3. Continue until all characters are processed.  

---

## ⏱ Complexity
- **Time Complexity:** O(n), where `n` = length of the string  
- **Space Complexity:** O(1)  

---

## 🗂️ GitHub Repository
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway
This problem highlights how **Excel columns follow a base-26 system**.  
Understanding such mappings helps in real-world applications like **encoding, spreadsheets, and string-based numbering systems**.  

---

## 📍 Tomorrow’s Problem
**Day 22:** Continue with Math ➡️ [13. Roman to Integer](https://leetcode.com/problems/roman-to-integer/) 🏛️  
