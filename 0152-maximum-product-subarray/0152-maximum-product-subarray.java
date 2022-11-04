class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0],pdt=1;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                pdt=pdt*nums[j];
                max=Math.max(max,pdt);
            }
            pdt=1;
        }
        return max;
    }
}