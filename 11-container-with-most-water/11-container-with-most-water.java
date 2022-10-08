class Solution {
    public int maxArea(int[] height) {
        int s=0,e=height.length-1;
        int j=height.length-1;
        ArrayList<Integer> a=new ArrayList<>();
        while(s<e){
            int i=Math.min(height[s],height[e]);
            a.add(i*j--);
            if(height[s]>height[e])
                e--;
            else
                s++;
            j=e-s;
        }
        j=Collections.max(a);
        return j;
    }
}