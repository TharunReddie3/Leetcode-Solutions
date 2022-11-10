class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        else{
            ArrayList<Character> h1=new ArrayList<>();
            for(int i=0;i<s.length();i++)
                h1.add(s.charAt(i));
            for(int i=0;i<t.length();i++){
                if(h1.contains(t.charAt(i)))
                    h1.remove(Character.valueOf(t.charAt(i)));
            }
            if(h1.size()==0)
                return true;
            return false;
        }
    }
}