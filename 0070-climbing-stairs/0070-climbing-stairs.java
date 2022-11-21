class Solution {
    public int climbStairs(int n) {
        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        for(int i=2;i<n;i++)
            l.add(l.get(i-1)+l.get(i-2));
        return l.get(n-1);
    }
}