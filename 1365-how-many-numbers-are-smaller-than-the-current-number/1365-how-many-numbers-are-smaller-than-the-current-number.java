class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int c=0;
        int num[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j] && nums[i]!=nums[j])
                    c++;
            }
            num[i]=c;
            c=0;
        }
        return num;
    }
}