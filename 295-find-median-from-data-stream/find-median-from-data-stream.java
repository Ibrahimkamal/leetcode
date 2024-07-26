class MedianFinder {
    PriorityQueue<Integer> max_half;
    PriorityQueue<Integer> min_half;
    public MedianFinder() {
        this.max_half=new PriorityQueue<>();
        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer a,Integer b){
                return b-a;
            }
        };
        this.min_half=new PriorityQueue<>(comparator);
    }
    
    public void addNum(int num) {
        if(!min_half.isEmpty() && min_half.peek()<num){
            max_half.offer(num);
            System.out.println(this.max_half.size());

        }else{
            min_half.offer(num);
            System.out.println(this.min_half.size());
        }
        while(Math.abs(min_half.size()-max_half.size())>1){
            if(min_half.size()>max_half.size()){
                max_half.offer(min_half.poll());
            }else{
                min_half.offer(max_half.poll());
            }
        }
        
    }
    
    public double findMedian() {
        System.out.println(this.min_half.size());
        System.out.println(this.max_half.size());
        
        if(this.min_half.size()==this.max_half.size()){
            return (this.min_half.peek()+this.max_half.peek())/2.0;
        }else if(this.min_half.size()>this.max_half.size()){
            return this.min_half.peek();
        }else{
            return this.max_half.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */