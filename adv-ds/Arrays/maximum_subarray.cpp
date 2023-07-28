#include <vector>
#include <climits>

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n = nums.size();
        int maxi = INT_MIN;
        int neg = INT_MIN;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            neg = max(neg, nums[i]);
            if (sum < 0) {
                sum = 0;
            }
            maxi = max(maxi, sum);
        }
        if (maxi == 0) {
            return neg;
        }
        return maxi;
    }
};
