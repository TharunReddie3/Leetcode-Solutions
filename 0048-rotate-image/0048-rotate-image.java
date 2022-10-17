class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int arr[]=new int[n*n];
        int k=0,i=0;
        while(k<n*n){
            for(int j=n-1;j>=0;j--){
                arr[k]=matrix[j][i];
                k++;
            }
            i++;
        }
        k=0;
        for(int j=0;j<n;j++){
            for(int m=0;m<n;m++){
                matrix[j][m]=arr[k];
                k++;
            }
        }
    }
}