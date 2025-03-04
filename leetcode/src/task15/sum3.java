package task15;

import java.util.*;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/10 20:13
 */
public class sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> Lists = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){
                return Lists;
            }
           for (int j = i + 1; j < nums.length; j++) {
             b:   for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {

                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);

                        if (!Lists.contains(temp)) {
                            Lists.add(temp);
                            break b;
                        }


                    }

                }

            }

        }

        return Lists;
    }
}
