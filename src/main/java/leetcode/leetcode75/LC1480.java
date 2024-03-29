package leetcode.leetcode75;

/**
 * 1480. Running Sum of 1d Array
 */
public class LC1480 {

    /**
     * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
     * <p>
     * Return the running sum of nums.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,2,3,4]
     * Output: [1,3,6,10]
     * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
     * Example 2:
     * <p>
     * Input: nums = [1,1,1,1,1]
     * Output: [1,2,3,4,5]
     * Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
     * Example 3:
     * <p>
     * Input: nums = [3,1,2,10,1]
     * Output: [3,4,6,16,17]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 1000
     * -10^6 <= nums[i] <= 10^6
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(runningSum(new int[]{1, 2, 3, 4}));
    }

    /**
     * First
     * Runtime
     * 1 ms
     * Beats
     * 55.92%
     * Memory
     * 43.3 MB
     * Beats
     * 45.36%
     * @param nums
     * @return
     */
    public static int[] runningSum1(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }

    /**
     * refactoring
     * Runtime
     * 1 ms
     * Beats
     * 55.92%
     * Memory
     * 43.5 MB
     * Beats
     * 25.56%
     * @param nums
     * @return
     */
    public static int[] runningSum2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    /**
     * refactoring 2
     * @param nums
     * @return
     */
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i -1];
        }
        return nums;
    }

}
