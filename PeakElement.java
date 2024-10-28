public class PeakElement {
    public static int findPeak(int[] nums) {
        int n = nums.length;
        // Check if the first element is a peak
        if (n == 1 || nums[0] >= nums[1])
            return 0;
        // Check if the last element is a peak
        if (nums[n - 1] >= nums[n - 2])
            return n - 1;
        
        // Check for peak elements in the middle
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] >= nums[i - 1] && nums[i] >= nums[i + 1]) {
                return i;
            }
        }
        return -1; // No peak found
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int peakIndex = findPeak(nums);
        if (peakIndex != -1) {
            System.out.println("Peak element is at index: " + peakIndex);
            System.out.println("Peak element value is: " + nums[peakIndex]);
        } else {
            System.out.println("No peak element found.");
        }
    }
}
