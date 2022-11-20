class Solution {
    public String sortSentence(String s) {
        String str[]=null;
        str=s.split(" ");
        int j=1;
        String p="";
        while(j<=str.length){
            for(int i=0;i<str.length;i++){
                if(j==str[i].charAt(str[i].length()-1)-'0'){
                    p=p+str[i].substring(0,str[i].length()-1)+" ";
                }
            }
            j++;
        }
        return p.substring(0,p.length()-1);
    }
}