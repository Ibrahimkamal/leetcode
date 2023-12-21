class Solution {
    public int removeElement(int[] nums, int val) {
        int ptr=0;
        int k=nums.length;
        while (ptr<k)
        {
            if (nums[ptr]==val){
                int temp=nums[k-1];
                nums[k-1]=nums[ptr];
                nums[ptr]=temp;
                k--;
            }else{
                ptr++;
            }
        }
        return k;
    }
}