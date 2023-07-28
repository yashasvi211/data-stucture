#include<iostream>
#include<vector>
#include<limits>
using namespace std;
class Solution {
public:
    int test(void)
    {
        vector<int>prices={7,1,5,3,6};
        cout<<maxProfit(prices);
        
    }
    int maxProfit(vector<int>& prices) 
    {
        int n = prices.size();
        int maxi = 0;
        int minPrice = numeric_limits<int>::max();
        
        for (int i = 0; i < n; i++) {
            minPrice = min(minPrice, prices[i]);
            maxi = max(maxi, prices[i] - minPrice);
        }
        
        return maxi;
    }
};
int main()
{
    Solution a; 
    a.test();
}