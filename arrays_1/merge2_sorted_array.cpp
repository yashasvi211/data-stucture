#include<iostream>
#include<array>
using namespace std;

array<int, 8> merge(array<int, 4> arr1, array<int, 4> arr2, array<int, 8> arr3)
{
    int m1 = 0;
    int m2 = 0;
    int m3 = 0;

    while (m1 < arr1.size() && m2 < arr2.size())
    {
        if (arr1[m1] < arr2[m2])
        {
            arr3[m3] = arr1[m1];
            m1++;
            m3++;
        }
        else
        {
            arr3[m3] = arr2[m2];
            m2++;
            m3++;
        }
    }

    while (m1 < arr1.size())
    {
        arr3[m3] = arr1[m1];
        m1++;
        m3++;
    }

    while (m2 < arr2.size())
    {
        arr3[m3] = arr2[m2];
        m2++;
        m3++;
    }

    return arr3;
}

int main()
{
    array<int, 4> arr1 = {4, 5, 10, 15};
    array<int, 4> arr2 = {0,1,2,3};
    array<int, 8> arr3 = {0};
    
    arr3 = merge(arr1, arr2, arr3);

    for (int i : arr3)
    {
        cout << i << " ";
    }

    return 0;
}
