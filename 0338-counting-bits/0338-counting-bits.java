class Solution {
    public int[] countBits(int n) {
        int a[]=new int[n+1];
        for(int i=0;i<=n;i++)
            a[i]=bit(i);
        return a;
    }
    public static int bit(int i){
        int c=0;
        while(i>0){
            if(1==(i%2))
                c++;
            i=i/2;
        }
        return c;
    }
}