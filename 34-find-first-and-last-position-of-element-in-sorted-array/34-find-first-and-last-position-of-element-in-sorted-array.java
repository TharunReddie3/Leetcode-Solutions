class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=-1,end=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                start=i;
                break;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                end=i;
            }
        }
        int arr[]={start,end};
        return arr;
    }
}