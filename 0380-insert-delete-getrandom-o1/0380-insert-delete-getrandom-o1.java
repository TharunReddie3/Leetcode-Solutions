class RandomizedSet {
    public static HashSet<String> s;
    public static HashSet<Integer> h;
    java.util.Random random;

    public RandomizedSet() {
        this.s=new HashSet<String>();
        this.h=new HashSet<Integer>();
        this.random=new Random();
    }
    
    public boolean insert(int val) {
        if(h.contains(val))
            return false;
        else{
            h.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(h.contains(val)){
            h.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        Integer[] temp = h.toArray(new Integer[0]);
        return temp[random.nextInt(h.size())];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */