class Solution {
    public int commonFactors(int a, int b) {
        int c=0;
        HashSet<Integer> h=new HashSet<>();
        for(int i=1;i<=a;i++){
            if(a%i==0)
                h.add(a/i);
        }
        for(int i=1;i<=b;i++){
            if(b%i==0){
                if(h.contains(b/i))
                    c++;
            }
        }
        return c;
    }
}