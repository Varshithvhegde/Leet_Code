/*
Given an integer array nums, return the most frequent even element.

If there is a tie, return the smallest one. If there is no such element, return -1.

 

Example 1:

Input: nums = [0,1,2,2,4,4,1]
Output: 2
Explanation:
The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
We return the smallest one, which is 2.
*/


class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        
        int max=-1;
        int res=Integer.MAX_VALUE;
        
        for(int i:nums){
            
           
            if(i%2 == 0){                        //Only even element
            map.put(i,map.getOrDefault(i,0)+1);
            
            
            if(map.get(i)>max){                 //Check if greater than Max Val
            max=Math.max(max,map.get(i));
            res=i;
            }                                   
            else if(map.get(i)==max && res>i){  //Check if equals to Max Val and element is less than current res
            res=i;
            }
            }
        }
        
        return res==Integer.MAX_VALUE? -1: res; 
        
    }
}
