class Solution {
    public char findTheDifference(String s, String t) {
        ArrayList<Character> a=new ArrayList<>();
        char c='a';
        for(int i=0;i<t.length();i++)
            a.add(t.charAt(i));
        for(int i=0;i<s.length();i++)
            a.remove(Character.valueOf(s.charAt(i)));
        c=a.get(0);
        return c;
    }
}