class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h=new HashSet<>();
        int t=0,e=0,maxl=0;
        while(e<s.length()){
            char c=s.charAt(e);
            if(h.contains(c)){
                h.remove(s.charAt(t));
                t++;
            }
            else{
                h.add(c);
                maxl=Math.max(maxl,e-t+1);
                e++;
            }
        }
        return maxl;
    }
}