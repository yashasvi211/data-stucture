class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        int size = nums.size();
        vector<int> arr(size, 0);

        for (int i = 0; i < size; i++) {
            arr[nums[i]]++;
            if (arr[nums[i]] > 1) {
                return nums[i];
            }
        }

        return -1; // No duplicate found
    }
};
