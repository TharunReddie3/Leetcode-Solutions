class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        int t=0,e=0,maxl=0,sum=0;
        while(e<nums.length){
            int c=nums[e];
            if(h.contains(c)){
                sum=sum-nums[t];
                h.remove(nums[t]);
                t++;
            }
            else{
                h.add(c);
                sum=sum+c;
                maxl=Math.max(maxl,sum);
                e++;
            }
        }
        return maxl;
    }
}