class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,max1=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
             sum=sum+nums[i];
            max1=Math.max(max1,sum);
            if(sum<0)
                sum=0;
            //max1=Math.max(max1,sum);
        }
        //max1=Math.max(max1,sum);
        return max1;
    }
}