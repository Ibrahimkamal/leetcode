class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<deck.length;i++){ 
            q.add(i);
        }
        Arrays.sort(deck);
        int[]result=new int[deck.length];
        for(int i=0;i<deck.length;i++){
            result[q.poll()]=deck[i];
            if(!q.isEmpty())
                q.add(q.poll());
        }
        return result;

    }
}