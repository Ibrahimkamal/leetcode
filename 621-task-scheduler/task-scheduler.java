class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char ch : tasks) {
            freq[ch - 'A']++;
        }
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                maxHeap.offer(freq[i]);
            }
        }
        int time=0;
        while (!maxHeap.isEmpty()) {
            int cycle=n+1;
            List<Integer> store = new ArrayList<>();
            int taskCount = 0;
            while(cycle-->0 &&!maxHeap.isEmpty()){
                int currentFreq=maxHeap.poll();
                if(currentFreq>1){
                    store.add(currentFreq-1);
                }
                taskCount++;
                // cycle--;
            }
            store.forEach(maxHeap::offer);
            time+=(maxHeap.isEmpty()?taskCount:n+1);
        }
        return time;
    }
}