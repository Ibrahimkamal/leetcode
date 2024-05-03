class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Comparator<String[]> comparator1=new Comparator<String[]>() {
            @Override
            public int compare(String [] arr1, String[] arr2){
                int primary=arr1[1].compareTo(arr2[1]);
                if(primary!=0)
                    return primary;
                return arr1[0].compareTo(arr2[0]);
            }
        };
        Comparator<String[]> comparator2=new Comparator<String[]>() {
            @Override
            public int compare(String [] arr1, String[] arr2){
                return arr1[0].compareTo(arr2[0]);
            }
        };
        PriorityQueue<String[]> words=new PriorityQueue<>(comparator1);
        ArrayDeque<String[]> digits=new ArrayDeque<>();

        for(String log:logs){
            int index=log.indexOf(" ");
            String identifier=log.substring(0,index);
            String text=log.substring(index+1);
            boolean isDigit=true; 
            if (text.charAt(0)>='0' && text.charAt(0)<='9')
            {
                isDigit=true;
            }
            else {
                isDigit=false;
            }
            if(isDigit){
                digits.add(new String[]{identifier,text});
            }
            else{
                words.add(new String[]{identifier,text});
            }
        }
        int index=0;
        while(!words.isEmpty()){
            logs[index]=words.peek()[0]+" "+words.peek()[1];
            words.poll();
            index++;
        }
         while(!digits.isEmpty()){
            logs[index]=digits.peek()[0]+" "+digits.peek()[1];
            digits.poll();
            index++;
         }
         return logs;
    }
}