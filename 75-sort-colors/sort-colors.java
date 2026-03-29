import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> middle = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        ArrayList<Integer> ans  = new ArrayList<>();
        int pivot = 1;

        for( int x : nums){
            if(x< pivot){
                left.add(x);
            }
        }
        for(int y: nums){
            if (y == pivot){
                middle.add(y);
            }
        }

        for(int z : nums){
            if(z > pivot){
                right.add(z);
            }
        }
        ans.addAll(left);
        ans.addAll(middle);
        ans.addAll(right);

        for(int i = 0; i<nums.length ; i++){
            nums[i] = ans.get(i);
        }
       

    }
}