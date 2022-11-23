class Solution {
    public int xorOperation(int n, int start) {
        int c=0;
        int k=0;
        for(int i=0;i<n;i++){
            k=start+(2*i);
            c=k^c;
            //System.out.println(k);
        }
        return c;
    }
}