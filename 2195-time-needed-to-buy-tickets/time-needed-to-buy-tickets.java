class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int val=tickets[k];
        int result=0;
        for(int i=0;i<tickets.length;i++){
            if(i>k){
                result+=Math.min(val-1,tickets[i]);
            }else{
                result+=Math.min(val,tickets[i]);
            }
        }
        return result;
    }
}
//  24 24 5 24 24 24 24 8