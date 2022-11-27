class Solution {
    public int[] findErrorNums(int[] nums) {
        int a[]=new int[2];
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++)
                if(nums[i]==nums[j])
                    c++;
            if(c==2){
                a[0]=nums[i];
                break;
            }
            c=0;
        }
        for(int i=1;i<=nums.length;i++){
            for(int j=0;j<nums.length;j++)
                if(i==nums[j])
                    c=1;
            if(c!=1){
                a[1]=i;
                break;
            }
            c=0;
        }
        return a;
    }
}