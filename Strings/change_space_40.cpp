#include<iostream>
using namespace std;
 

int main(void)
{
    string s;
    getline(cin, s);

    for (int i = 0; i < s.size(); i++)
    {
        if (s[i] == ' ')
        {
            s.replace(i, 1, "@40");
            // i += 3; // Skip the added characters
        }
    }

    cout << s;

    return 0;
}

 
