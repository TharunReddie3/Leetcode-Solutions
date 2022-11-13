import java.util.*;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer st=new StringTokenizer(s+""," ");
        String str="";
        while(st.hasMoreTokens()){
            str=" "+st.nextToken()+str;
        }
        str=str.substring(1,str.length());
        return str;
    }
}