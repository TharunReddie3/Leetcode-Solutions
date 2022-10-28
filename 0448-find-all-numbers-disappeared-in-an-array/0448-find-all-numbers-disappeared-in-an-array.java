class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            h.add(nums[i]);
        for(int i=1;i<=nums.length;i++){
            if(!h.contains(i))
                li.add(i);
        }
        return li;
    }
}