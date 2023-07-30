#include <iostream>

 
   class Solution {
public:
    double myPow(double x, int n) {
        if (n == 0)
            return 1.0;

        bool neg = (n < 0);
        if (neg)
            n = -n;

        double ans = 1.0;

        while (n > 0) {
            if (n % 2 == 1)
                ans *= x;

            x *= x;
            n /= 2;
        }

        return (neg) ? 1.0 / ans : ans;
    }
};

 

int main() {
    Solution solution;

    // Test cases
    double x = 2.0;
    int n = 10;
    double result = solution.myPow(x, n);
    std::cout << x << " raised to the power " << n << " = " << result << std::endl;

    x = 3.0;
    n = -4;
    result = solution.myPow(x, n);
    std::cout << x << " raised to the power " << n << " = " << result << std::endl;

    x = 1.5;
    n = 0;
    result = solution.myPow(x, n);
    std::cout << x << " raised to the power " << n << " = " << result << std::endl;

    return 0;
}
