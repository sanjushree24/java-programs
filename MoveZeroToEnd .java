class MoveZeroToEnd {
    public int minimumSwaps(int[] nums) {
        int zeros = 0;

        // Count zeros
        for (int x : nums) {
            if (x == 0) {
                zeros++;
            }
        }

        if (zeros == 0) {
            return 0;
        }

        // Count zeros in the last 'zeros' positions
        int alreadyAtEnd = 0;

        for (int i = nums.length - zeros; i < nums.length; i++) {
            if (nums[i] == 0) {
                alreadyAtEnd++;
            }
        }

        return zeros - alreadyAtEnd;
    }
}