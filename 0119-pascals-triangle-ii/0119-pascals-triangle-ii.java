class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> a=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        a.add(arr);
        for(int i=1;i<=rowIndex;i++){
            List<Integer> a1=new ArrayList<>();
            a1.add(1);
            for(int j=1;j<=i-1;j++){
                a1.add(a.get(i-1).get(j-1)+a.get(i-1).get(j));
            }
            a1.add(1);
            a.add(a1);
        }
        return a.get(rowIndex);
    }
}