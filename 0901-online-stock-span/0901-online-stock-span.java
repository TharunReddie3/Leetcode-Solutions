class StockSpanner {
    Stack<Integer> s;
    Stack<Integer> a;

    public StockSpanner() {
        s=new Stack<>();
        a=new Stack<>();
    }
    
    public int next(int price) {
        int span=1;
        while(!s.isEmpty() && !a.isEmpty() && s.peek()<=price){
            span=a.peek()+span;
            s.pop();
            a.pop();
        }
        s.push(price);
        a.push(span);
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */