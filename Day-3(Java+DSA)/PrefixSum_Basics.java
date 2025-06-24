public class PrefixSum_Basics {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Print prefix sum array
        System.out.print("Prefix Sum: ");
        for (int val : prefix) {
            System.out.print(val + " ");
        }
    }
}
