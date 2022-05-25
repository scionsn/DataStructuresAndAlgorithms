// ref -takeufwd
class SearchElemInRotatedSortedArr {
    public int search(int[] nums, int target) {
        if (nums.length == 1)
            return nums[0] == target ? 0 : -1;
        // use binary search , since we are dealing with sorted arays
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return mid;
            // check if the left half of the array is sorted
            if (nums[low] <= nums[mid]) {
                // check if the target exists in the left haf of the array.
                if (target >= nums[low] && target <= nums[mid]) {
                    high = mid;
                } else
                    low = mid + 1;
            }
            // if left half aint sorted then the right half will be anyways
            else {
                // check if the target exists in the right half
                if (target >= nums[mid + 1] && target <= nums[high]) {
                    low = mid + 1;

                } else {
                    high = mid;
                }
            }
        }
        // if element is not foiund in the array then return -1;
        return -1;

    }
}