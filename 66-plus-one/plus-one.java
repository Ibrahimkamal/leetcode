class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            digits[i]++;
            digits[i]=digits[i]%10;
            if(digits[i]!=0)
                break;
        }
        if(digits[0]==0){
            int[] temp_arr=new int[digits.length+1];
            temp_arr[0]=1;
            for(int i=1;i<temp_arr.length;i++){
                temp_arr[i]=digits[i-1];
            }
            return temp_arr;
        }
        return digits;
    }
}