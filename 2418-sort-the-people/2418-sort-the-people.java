class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> h=new HashMap<>();
        for(int i=0;i<names.length;i++)
            h.put(heights[i],names[i]);
        Arrays.sort(heights);
        int j=names.length-1;
        for(int i:heights)
            names[j--]=h.get(i);
        return names;
    }
}