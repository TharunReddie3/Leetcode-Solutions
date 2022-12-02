class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())
            return false;
        else{
            HashMap<Character,Integer> h=new HashMap<>();
            HashMap<Character,Integer> h1=new HashMap<>();
            for(int i=0;i<word1.length();i++){
                if(h.containsKey(word1.charAt(i)))
                    h.put(word1.charAt(i),h.get(word1.charAt(i))+1);
                else
                    h.put(word1.charAt(i),0);
            }
            for(int i=0;i<word2.length();i++){
                if(h1.containsKey(word2.charAt(i)))
                    h1.put(word2.charAt(i),h1.get(word2.charAt(i))+1);
                else
                    h1.put(word2.charAt(i),0);
            }
            ArrayList<Integer> set1 = new ArrayList<>(h1.values());
            ArrayList<Integer> set2 = new ArrayList<>(h.values());
            Collections.sort(set1);
            Collections.sort(set2);
            System.out.println(h.values()+"   "+h1.values());
            return ((h.keySet().equals(h1.keySet())) && (set1.equals(set2)));
        }
    }
}