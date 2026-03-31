import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int k = j + 1;
                int right = nums.length - 1;

                while (k < right) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[right];
                   
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[right]));

                        k++;
                        right--;

                        
                        while (k < right && nums[k] == nums[k - 1]) k++;
                        while (k < right && nums[right] == nums[right + 1]) right--;

                    } else if (sum < target) {
                        k++;
                    } else {
                        right--;
                    }
                   
                }
            }
        }

        return result;
    }
}