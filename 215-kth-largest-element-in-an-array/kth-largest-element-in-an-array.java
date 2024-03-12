class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        for (int num :nums){
            priorityQueue.add(num);
        }
        for (int i=0;i<nums.length-k;i++){
            priorityQueue.poll();
        }
        return priorityQueue.poll();
    }
}