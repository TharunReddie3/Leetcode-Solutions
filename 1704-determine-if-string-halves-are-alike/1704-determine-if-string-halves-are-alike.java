class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int c=0,d=0;
        String a=s.substring(0,s.length()/2);
        String b=s.substring(s.length()/2,s.length());
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<a.length();i++)
            if(a.charAt(i)=='a' || a.charAt(i)=='i' || a.charAt(i)=='e' || a.charAt(i)=='o' ||                a.charAt(i)=='u')
                c++;
        
        for(int i=0;i<b.length();i++)
            if(b.charAt(i)=='a' || b.charAt(i)=='i' || b.charAt(i)=='e' || b.charAt(i)=='o' ||                 b.charAt(i)=='u')
                d++;
        if(c==d)
            return true;
        return false;
    }
}