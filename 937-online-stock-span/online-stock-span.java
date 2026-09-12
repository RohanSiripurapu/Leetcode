class StockSpanner {

    Stack<Integer> s;
    Stack<Integer> count;

    public StockSpanner() {
        s = new Stack<>();
        count = new Stack<>();
    }

    public int next(int price) {

        int span = 1;

        while (!s.isEmpty() && s.peek() <= price) {
            s.pop();
            span += count.pop();
        }

        s.push(price);
        count.push(span);

        return span;
    }
}