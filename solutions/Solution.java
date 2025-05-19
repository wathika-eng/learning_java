class Solution {
    public static void main(String[] args) {
        int[] num = { 3, 2, 4 };
        int[] solution = twoSum(num, 6);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}