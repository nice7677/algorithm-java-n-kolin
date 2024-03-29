package leetcode.bs;

/**
 * 704. Binary Search
 */
public class LC704 {

    /**
     * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
     * <p>
     * You must write an algorithm with O(log n) runtime complexity.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [-1,0,3,5,9,12], target = 9
     * Output: 4
     * Explanation: 9 exists in nums and its index is 4
     * Example 2:
     * <p>
     * Input: nums = [-1,0,3,5,9,12], target = 2
     * Output: -1
     * Explanation: 2 does not exist in nums so return -1
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 104
     * -104 < nums[i], target < 104
     * All the integers in nums are unique.
     * nums is sorted in ascending order.
     *
     * @param args
     */
    public static void main(String[] args) {
//        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(search2(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    static int i = 0;

    /**
     * Runtime
     * 1 ms
     * Beats
     * 15.97%
     * Memory
     * 43.1 MB
     * Beats
     * 87.14%
     * 꼼수왕;
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {

        for (int num : nums) {
            if (num == target) return i;
            i++;
        }
        return -1;

    }

    public static int search2(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
            if (nums[mid] > target){
                right = mid - 1;
            }
        }

        return -1;

    }

}
