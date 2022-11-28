class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        str=str.replaceAll(" ","");
        System.out.println(str);
        List<Character> l=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>=97 && str.charAt(i) <=122) || (str.charAt(i)>=48 && str.charAt(i) <=57))
                l.add(str.charAt(i));
        }
        str="";
        String st="";
        for(int i=0;i<l.size();i++)
            str=str+l.get(i);
        for(int i=0;i<l.size();i++)
            st=l.get(i)+st;
        System.out.println(str);
        return str.equals(st);
    }
}