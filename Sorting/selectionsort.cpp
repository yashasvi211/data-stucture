#include <iostream>
using namespace std;
void selection(int *arr, int size)
{
    for (int i = 0; i < size; i++)
    {
        int min = i;
        for (int j = i; j < size; j++)
        {
            if (arr[j] < arr[min])
            {
                min = j;
            }
        }
        swap(arr[min], arr[i]);
    }
}
int main()
{
    int arr[] = {6, 5, 3, 2, 1};
    int size = 5;
    selection(arr, size);
    for (int j = 0; j < size; j++)
    {
        cout<<arr[j]<<" ";
    }
}