import java.util.Arrays;


class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length - 1;
        int[] arr = new int[nums.length];

        int i = 0;
        while (i <= n) {
            nums[i] = nums[i] * nums[i];
            arr[i] = nums[i];
            i++;
        }


        Arrays.sort(arr);
        return arr;
    }
}