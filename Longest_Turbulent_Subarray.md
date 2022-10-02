# [978\. Longest Turbulent Subarray](https://leetcode.com/problems/longest-turbulent-subarray/submissions/)

## Description

Difficulty: **Medium**  

Related Topics: [Array](https://leetcode.com/tag/array/), [Dynamic Programming](https://leetcode.com/tag/dynamic-programming/), [Sliding Window](https://leetcode.com/tag/sliding-window/)


Given an integer array `arr`, return _the length of a maximum size turbulent subarray of_ `arr`.

A subarray is **turbulent** if the comparison sign flips between each adjacent pair of elements in the subarray.

More formally, a subarray `[arr[i], arr[i + 1], ..., arr[j]]` of `arr` is said to be turbulent if and only if:

*   For `i <= k < j`:
    *   `arr[k] > arr[k + 1]` when `k` is odd, and
    *   `arr[k] < arr[k + 1]` when `k` is even.
*   Or, for `i <= k < j`:
    *   `arr[k] > arr[k + 1]` when `k` is even, and
    *   `arr[k] < arr[k + 1]` when `k` is odd.

**Example 1:**

```
Input: arr = [9,4,2,10,7,8,8,1,9]
Output: 5
Explanation: arr[1] > arr[2] < arr[3] > arr[4] < arr[5]
```

**Example 2:**

```
Input: arr = [4,8,12,16]
Output: 2
```

**Example 3:**

```
Input: arr = [100]
Output: 1
```

**Constraints:**

*   1 <= arr.length <= 4 * 10<sup>4</sup>
*   0 <= arr[i] <= 10<sup>9</sup>


## Solution

Language: **Java**

```java
class Solution {
    public int maxTurbulenceSize(int[] A) {
        int inc = 1, dec = 1, result = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[i - 1]) {
                dec = inc + 1;
                inc = 1;
            } else if (A[i] > A[i - 1]) {
                inc = dec + 1;
                dec = 1;
            } else {
                inc = 1;
                dec = 1;
            }
            result = Math.max(result, Math.max(dec, inc));
        }
        return result;
    }
}
```
