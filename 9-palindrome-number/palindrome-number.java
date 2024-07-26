class Solution {
    public boolean isPalindrome(int x) {
        if (x<0)
            return false;
        // String str_temp=Integer.toString(x);
        // for(int i=0;i<str_temp.length()/2;i++){
        //     if(str_temp.charAt(i)!=str_temp.charAt(str_temp.length()-1-i))
        //         return false;
        // }
        // return true;
        ArrayDeque<Integer> dequeue=new ArrayDeque<>();
        while(x>0){
            dequeue.add(x%10);
            x=x/10;
        }
        while(dequeue.size()>1){
            if(dequeue.peekFirst()==dequeue.peekLast()){
                dequeue.removeFirst();
                dequeue.removeLast();
            }else
                return false;
        }
        return true;
    }
}