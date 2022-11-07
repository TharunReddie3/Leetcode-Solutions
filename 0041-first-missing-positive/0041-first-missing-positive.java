class Solution {
    public int firstMissingPositive(int[] nums) {
       int min=1;
       HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                h.add(nums[i]);
        }
        for(int i=0;i<h.size();i++){
            if(h.contains(min))
                min++;
            else
                return min;
        }
        return min;
    }
}