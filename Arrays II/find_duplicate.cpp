#include <iostream>
#include <vector>

class Solution {
public:
    int findDuplicate(std::vector<int>& nums) {
        int size = nums.size();
        std::vector<int> arr(size, 0);

        for (int i = 0; i < size; i++) {
            arr[nums[i]]++;
            if (arr[nums[i]] > 1) {
                return nums[i];
            }
        }

        return -1; // No duplicate found
    }
};

int main() {
    Solution solution;

    std::vector<int> nums = {1, 3, 4, 2, 2}; // Example input
    int duplicate = solution.findDuplicate(nums);

    std::cout << "Duplicate element: " << duplicate << std::endl;

    return 0;
}
