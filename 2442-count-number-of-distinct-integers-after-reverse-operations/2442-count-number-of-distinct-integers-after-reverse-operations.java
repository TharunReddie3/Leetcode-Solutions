class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++)
            h.add(nums[i]);
        for(int i=0;i<nums.length;i++){
            int r=rev(nums[i]);
            h.add(r);
        }
        return h.size();
    }
    public static int rev(int num){
        StringBuilder s=new StringBuilder();
        s.append(num);
        s.reverse();
        String str=s.toString();
        return Integer.valueOf(str);
    }
}