public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        // Use Floyd's Tortoise and Hare (Cycle Detection) Algorithm
        int slow = nums[0];
        int fast = nums[0];

        // Step 1: Detect cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Step 2: Find the entrance to the cycle
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow; 
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4, 2, 2};
        System.out.println("Duplicate Number: " + findDuplicate(nums1)); 

        int[] nums2 = {3, 1, 3, 4, 2};
        System.out.println("Duplicate Number: " + findDuplicate(nums2));
    }
}
