#include <iostream>
using namespace std;
void insertion(int *arr, int size)
{
    for (int i = 1; i < size; i++)
    {
        int temp = arr[i];
        int j = i - 1;
        while (j >= 0)
        {
            if (temp < arr[j])
            {
                arr[j + 1] = arr[j];
            }
            else
            {
                break;
            }
            j--;
            arr[j + 1] = temp;
        }
    }
}
int main()
{
    int arr[] = {3, 2, 4, 1};
    int size = 4;
    insertion(arr, size);
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
}