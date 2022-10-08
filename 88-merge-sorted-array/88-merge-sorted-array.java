class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(nums1[i]>nums2[j]){
                    int t=nums1[i];
                    nums1[i]=nums2[j];
                    nums2[j]=t;
                }
            }
        }
        Arrays.sort(nums2);
        for(int i=0;i<n;i++)
            nums1[m+i]=nums2[i];
    }
}