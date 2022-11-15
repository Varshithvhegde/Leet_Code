# [4\. Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/submissions/)

## Description

Difficulty: **Hard**  

Related Topics: [Array](https://leetcode.com/tag/array/), [Binary Search](https://leetcode.com/tag/binary-search/), [Divide and Conquer](https://leetcode.com/tag/divide-and-conquer/)


Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return **the median** of the two sorted arrays.

The overall run time complexity should be `O(log (m+n))`.

**Example 1:**

```
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
```

**Example 2:**

```
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
```

**Constraints:**

*   `nums1.length == m`
*   `nums2.length == n`
*   `0 <= m <= 1000`
*   `0 <= n <= 1000`
*   `1 <= m + n <= 2000`
*   -10<sup>6</sup> <= nums1[i], nums2[i] <= 10<sup>6</sup>


## Solution

Language: **Java**

```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        double median=0;
        int num[] = new int[a+b];
        
        System.arraycopy(nums1, 0, num, 0, a);
        System.arraycopy(nums2,0, num, a, b);
        Arrays.sort(num);
        int length=num.length;
        System.out.println(((length+1)/2)-1);
        if(num.length%2!=0){
            median=num[((length+1)/2)-1];
            
        }
        else{
          median=(double)(num[(length/2)-1]  + num[((length)/2)])/2;
            System.out.println(num[(length/2)-1]+" "+ num[((length)/2)]);
        }
        return median;
        
    }
}
```
