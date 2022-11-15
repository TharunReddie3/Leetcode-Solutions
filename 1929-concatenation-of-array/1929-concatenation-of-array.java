class Solution {
    public int[] getConcatenation(int[] nums) {
        int a[]=new int[2*nums.length];
        int j=0;
        for(int i=0;i<2*nums.length;i++)
        {
            a[i]=nums[j++];
            if(j==nums.length)
                j=0;
        }
        return a;
    }
}