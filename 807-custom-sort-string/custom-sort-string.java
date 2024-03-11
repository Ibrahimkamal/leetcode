class Solution {
    public String customSortString(String order, String s) {
        String result="";
        List<Character> linkedList=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            linkedList.add(s.charAt(i));
        }
        for(int i=0;i<order.length();i++){
            while(linkedList.contains(order.charAt(i)))
            {
                result+=order.charAt(i);
                linkedList.remove(Character.valueOf(order.charAt(i)));
            }
        }
        for(char item:linkedList)
        {
            result+=item;
        }
        return result ;

    }
}