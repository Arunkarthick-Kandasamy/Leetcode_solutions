class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int prod = 1; // Initialize the product of elements in the current subarray
        int count = 0; // Initialize the count of valid subarrays
        
        // Outer loop: iterate over each element, treating it as the start of a subarray
        for (int i = 0; i < nums.length; i++) {
            prod = 1; // Reset the product for the new subarray starting at index 'i'
            
            // Inner loop: extend the subarray starting from 'i' to include 'j'
            for (int j = i; j < nums.length; j++) {
                prod = prod * nums[j]; // Multiply the current element into the product
                
                // If the product exceeds or equals 'k', no need to continue this subarray
                if (prod >= k) {
                    // Exit the loop early, as further elements will only increase the product
                    break;
                }
                
                // If the product is still less than 'k', this subarray is valid, so count it
                count++;
            }
        }
        
        // Return the total count of valid subarrays
        return count;
    }
}
