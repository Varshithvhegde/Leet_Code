class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       int len1 = nums1.length;
        int len2 = nums2.length;
        
        int[] sh;
        int[] lg;
        
        if (len1 < len2) {
            sh = nums1;
            lg = nums2;
        }
        else {
            sh = nums2;
            lg = nums1;
        }
        
        Set<Integer> set = new HashSet<>();
        
        for (int num1 : sh) {
            set.add(num1);
        }
        //Used HashSet refer geeksforgeek forr more info
        //If hashset is not used we end up having higher Time Complexity like literally having 
        //4 inner loops
        Set<Integer> ansSet = new HashSet<>();
        
        for (int num2 : lg) {
            if (set.contains(num2)) {
                ansSet.add(num2);
            }
        }
        
        int[] ans = new int[ansSet.size()];
        int i = 0;
        
        for (int n : ansSet) {
            ans[i] = n;
            i++;
        }
        
        return ans;
    }
}
