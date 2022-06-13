import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int j=0,k=0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(h.containsValue(nums1[i]))
                continue;
            else
                h.put(j++,nums1[i]);
        }
        HashMap<Integer,Integer> h1 = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            if(h1.containsValue(nums2[i]))
                continue;
            else if(h.containsValue(nums2[i]))
                h1.put(k++,nums2[i]);
            else
                continue;
        }
        int a[] = new int[h1.size()];
        for(int i=0;i<a.length;i++)
            a[i]=h1.get(i);
        return a;
    }
}