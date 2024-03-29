class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(h.contains(nums[i]))
                return nums[i];
            else
                h.add(nums[i]);
        }
        return 0;
    }
}