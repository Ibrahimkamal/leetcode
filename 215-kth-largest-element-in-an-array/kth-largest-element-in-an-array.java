class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length-k];
        Comparator<Integer> comparator=new Comparator<Integer>(){
            @Override
            public int compare(Integer a,Integer b){
                return b-a;
            }
        };
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(comparator);
        for (int num :nums){
            priorityQueue.add(num);
        }
        for (int i=0;i<k-1;i++){
            priorityQueue.remove();
        }
        return priorityQueue.peek();
    }
}