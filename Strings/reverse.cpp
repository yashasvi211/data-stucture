#include <iostream>
using namespace std;

void reverse(char *name)
{
    int j = 0;
    for (int i = 0; name[i] != '\0'; i++)
    {
        j++;
    }
    j=j-1;
    int k = 0;
    while (k < j)
    {
        swap(name[k++], name[j--]);
    }
}

int main(void)
{
    char name[20];
    cout << "Enter the name: ";
    cin >> name;

    cout << "Your name is " << name;

    reverse(name);

    cout << "\nThe reverse string is: " << name;

    return 0;
}
