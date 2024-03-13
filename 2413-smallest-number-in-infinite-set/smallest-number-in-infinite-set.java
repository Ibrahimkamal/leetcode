class SmallestInfiniteSet {
    PriorityQueue<Integer> queue;
    public SmallestInfiniteSet() {
        queue=new PriorityQueue<>();
        for(int i=1;i<100000;i++)
        {
            queue.add(i);
        }
    }
    
    public int popSmallest() {
        return queue.poll();
    }
    
    public void addBack(int num) {
        if(queue.contains(num)){
            return;
        }
        queue.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */