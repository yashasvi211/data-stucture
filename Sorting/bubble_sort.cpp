#include <iostream>
using namespace std;
void bubbleSortde(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (arr[j] < arr[j+1])
            {
                swap(arr[j+1], arr[j]);
            }
        }
    }
}
void bubbleSortin(int arr[], int n)
{
    for (int i = 1; i < n; i++)
    {

        for (int j = 0; j < n - i ; j++)
        {

            if (arr[j] >arr[j + 1])
            {
                swap(arr[j], arr[j + 1]);
            }
        }
    }
}
void display(int *arr, int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
    cout << endl;
}

int main(void)
{

    bool firstTime = true; // Flag to check if it's the first time running the program

    while (true)
    {
        if (firstTime)
        {
            cout << "Welcome to the Bubble Sort Program!" << endl;
            firstTime = false;
            cout << endl;
        }

        short int i;
        cout << "1. Increasing Bubble Sort" << endl;
        cout << "2. Decreasing Bubble Sort" << endl;
        cout << "3. Exit" << endl;
        cout << "Select a choice:";
        cin >> i;

        if (i == 1 || i == 2)
        {
            int n;
            cout << "Enter the size of the array: ";
            cin >> n;

            int arr[n];

            cout << "Enter the input: ";
            for (int i = 0; i < n; i++)
            {
                cin >> arr[i];
            }
            cout << endl;
            if (i == 2)
            {
                bubbleSortde(arr, n);
            }
            else if (i == 1)
            {
                bubbleSortin(arr, n);
            }

            cout << "The Sorted Output is: ";

            display(arr, n);
        }
        else if (i == 3)
        {
            cout << "Thanks For Using" << endl;
            return 0;
        }
        else
        {
            cout << "Wrong Input" << endl
                 << "Try Again";
        }
    }
}