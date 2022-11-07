class Solution {
    public int maximum69Number (int num) {
        String s=Integer.toString(num);
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(c[i]=='6'){
                c[i]='9';
                break;
            }
        }
        s="";
        for(int i=0;i<c.length;i++)
            s=s+c[i];
        num=Integer.valueOf(s);
        return num;
    }
}