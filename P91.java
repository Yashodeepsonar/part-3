class MissingNumber {

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        int missingNumber = expectedSum - actualSum;

        return missingNumber;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int result = missingNumber(nums);
        System.out.println(result);
    }
}
