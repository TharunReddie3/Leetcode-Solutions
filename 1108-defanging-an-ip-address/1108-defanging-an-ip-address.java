import java.util.*;
class Solution {
    public String defangIPaddr(String address) {
        String s="[.]";
        StringTokenizer st=new StringTokenizer(address+"",".");
        String str="";
        while(st.hasMoreTokens()){
            str=str+s+st.nextToken();
        }
        str=str.substring(3,str.length());
        return str;
    }
}