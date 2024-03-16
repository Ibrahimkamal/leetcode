class MedianFinder {
    ArrayList<Integer> list;
    public MedianFinder() {
        this.list=new ArrayList<>();
    }
    private int binarySearch(ArrayList<Integer> list,int val){
        int low=0;
        int high=list.size()-1;
        int mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(list.get(mid)==val){
                return mid;
            }
            if(list.get(mid)<val){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
    public void addNum(int num) {
        if(list.isEmpty()){
            list.add(num);
            return;
        }
        int index=binarySearch(list, num);
        list.add(index, num);
    }

    public double findMedian() {
        int size=list.size();
        if(size%2==1){
            int val=(int)list.get(size/2);
            return val;
        }else{ 
            float val1=list.get(size/2-1);
            float val2=list.get(size/2);

            return (val1+val2)/2;
        }
    }
}
//0 1 2 3 4 5 6 7 8 9
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */