class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> sol= new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        sol.add(a);
        a.add(1);
        for(int i=1;i<numRows;i++){
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);
            for(int j=1;j<=i-1;j++){
                 arr.add(sol.get(i-1).get(j-1)+sol.get(i-1).get(j));
            }
            arr.add(1);
            sol.add(arr);
        }
        return sol;
    }
}