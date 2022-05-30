class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<n;i++)
            h.put(i,nums[i]);
        for(int i=n;i>=0;i--){
            if(h.containsValue(i))
                n=n-1;
            else
                break;
        }
        return n;
    }
}