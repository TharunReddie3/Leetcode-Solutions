class Solution {
    public String longestCommonPrefix(String[] strs) {
       String s="";
        Arrays.sort(strs);
        if(strs.length==0) return "";
        for(int i=0;i<strs[0].length();i++){
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=strs[0].charAt(i))
                    return s;
            }
            s=s+strs[0].charAt(i);
        }
        return s;
    }
}