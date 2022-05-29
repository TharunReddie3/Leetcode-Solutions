import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        int n=0;
        String str;
        HashMap<Integer,String> h = new HashMap<>();
        StringTokenizer st = new StringTokenizer(s," ");
        while(st.hasMoreTokens()){
            h.put(n,st.nextToken());
            n++;
        }
        str=h.get(n-1);
        return str.length();
    }
}