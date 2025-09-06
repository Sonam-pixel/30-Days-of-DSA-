# 💻 Day 25 of #30DaysOfDSA – LeetCode Beginner Challenge

## 🔹 Topic: String Manipulation / Two-Pointer  
**Today’s Problem:** [125. Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)  

---

## 📌 Problem Summary
Given a string `s`, return **true** if it is a palindrome, considering only **alphanumeric characters** and ignoring cases.  

- Example 1: `"A man, a plan, a canal: Panama"` → true  
- Example 2: `"race a car"` → false  

This problem tests **string preprocessing** and the efficient use of the **two-pointer technique**.

---

## 🛠 Concepts Used
- String cleaning (remove non-alphanumeric characters)  
- Case conversion (to lowercase)  
- Two-pointer comparison  

---

## 💡 Approach
1. Filter the string to keep only alphanumeric characters and convert it to lowercase.  
2. Use two pointers: one at the beginning and one at the end.  
3. Compare characters while moving inward.  
4. If all match → return true, otherwise false.  

---

## ⏱ Complexity
- **Time Complexity:** O(n)  
- **Space Complexity:** O(1) *(if done in-place, ignoring temporary cleaned string storage)*  

---

## 🗂️ GitHub Repository
[👉🏻 30-Days-of-DSA](https://github.com/Sonam-pixel/30-Days-of-DSA-)  

---

## ✅ Takeaway
Palindrome problems become much easier with the **two-pointer strategy**.  
Careful **input preprocessing** (ignoring spaces, punctuation, and case) is the key here.  

---

## 📍 Tomorrow’s Problem
**Day 26:** Another string manipulation task ➡️ [344. Reverse String](https://leetcode.com/problems/reverse-string/) 🚀  
