public class MaxSubarray_Kadane {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = kadanesAlgorithm(nums);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    public static int kadanesAlgorithm(int[] arr) {
        int maxSum = arr[0];   // assume first element is max
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
