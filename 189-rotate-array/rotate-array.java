class Solution {
    private void reverser(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverser(nums,0,nums.length-1);
        reverser(nums,0,k-1);
        reverser(nums,k,nums.length-1);
    }
}
// -1,-100,3,99
// -100,3,99,-1

// 1,2,3,4,5,6,7