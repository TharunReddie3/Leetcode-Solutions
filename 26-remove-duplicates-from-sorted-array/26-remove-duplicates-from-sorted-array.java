class Solution {
    public int removeDuplicates(int[] nums) {
        int start=nums[0],i=1;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=start){
                nums[i]=nums[j];
                start=nums[j];
                i++;
            }
            else
                start=nums[j];
        }
        return i;
    }
}