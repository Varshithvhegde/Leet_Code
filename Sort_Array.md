# [75\. Sort Colors](https://leetcode.com/problems/sort-colors/submissions/)

## Description

Difficulty: **Medium**  

Related Topics: [Array](https://leetcode.com/tag/array/), [Two Pointers](https://leetcode.com/tag/two-pointers/), [Sorting](https://leetcode.com/tag/sorting/)


Given an array `nums` with `n` objects colored red, white, or blue, sort them **[in-place](https://en.wikipedia.org/wiki/In-place_algorithm)** so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers `0`, `1`, and `2` to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

**Example 1:**

```
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
```

**Example 2:**

```
Input: nums = [2,0,1]
Output: [0,1,2]
```

**Constraints:**

*   `n == nums.length`
*   `1 <= n <= 300`
*   `nums[i]` is either `0`, `1`, or `2`.

**Follow up:** Could you come up with a one-pass algorithm using only constant extra space?


## Solution

Language: **Java**

```java
class Solution {
    public void sortColors(int[] i) {
       
        int max = i[0];
        int min = i[0];
        int temp = 0;
        for(int r = 0 ; r<i.length;r++){
            for(int t = r;t<i.length;t++){
                if(i[r]>i[t]){
                    temp = i[r];
                    i[r] = i[t];
                    i[t] = temp;
                    
                }
                
            }
        }
        for(int r1 = 0;r1<i.length;r1++){
            System.out.println(i[r1]);
        }
        
    }
}
```
