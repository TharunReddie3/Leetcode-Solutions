class Solution {
    public int minimumAverageDifference(int[] nums) {
        Long sum=0L,avg=0L;
        Long min=Long.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
            sum=sum+nums[i];
        Long num[]=new Long[nums.length];
        int j=1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            avg=avg+nums[i];
            sum=sum-avg;
            System.out.println(avg+" "+sum);
            if((n-j)==0)
                num[i]=avg/j;
            else
                num[i]=Math.abs((avg/j)-(sum/(n-j)));
            sum=sum+avg;
            j++;
        }
        
        for(int i=0;i<n;i++){
            if(min>num[i]){
                min=num[i];
                j=i;
            }
        }
        return j;
    }
}