# Find-the-Duplicate-Number
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive, there is exactly one repeated number in nums. Return this repeated number.
Explanation:
Step 1: Detect Cycle
Treat the array as a linked list where nums[i] represents the "next" pointer for index i.
Use the Floyd’s Tortoise and Hare Algorithm:
Move the slow pointer one step at a time.
Move the fast pointer two steps at a time.
When they meet, a cycle is detected.
Step 2: Find Cycle Entrance
Reset the slow pointer to the start of the array.
Move both slow and fast one step at a time.
The point where they meet again is the entrance to the cycle, which corresponds to the duplicate number.
Time and Space Complexity:
Time Complexity: O(n) (single pass to detect cycle + single pass to find entrance).
Space Complexity: O(1) (constant space used for pointers).
