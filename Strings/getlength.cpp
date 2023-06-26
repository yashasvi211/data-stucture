#include <iostream>
using namespace std;
int getlenght(char *name)
{
    int count = 0;
    for (int i = 0; name[i] != '\0'; i++)
    {
        count++;
    }
    return count;
}
int main(void)
{
    char name[20];
    cout << "Enter the name:";
    cin >> name; 
    cout << "Your name is " << name;
    cout << "\nThe length of the string is:" << getlenght(name);
}