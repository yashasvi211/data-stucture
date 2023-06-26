#include<iostream>
using namespace std;
void bubbleSort(int arr[], int n)
{
    for(int i=0;i<n;i++)
    {
        bool swapped = false;
        for(int j=0;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                swap(arr[j], arr[j+1]);
                swapped = true;
            }
        }
        if(swapped==false)
        {
            break;
        }
    }
}
void display(int *arr,int n)
{
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
}
int main(void)
{
    int n;
    cout<<"Enter the size of the array: ";
    cin>>n;
    int arr[n];
    cout<<"Enter the input: ";
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    bubbleSort(arr,n);
    cout<<"The Sorted Output is: ";
    display(arr,n);
}