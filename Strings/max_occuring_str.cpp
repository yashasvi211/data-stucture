#include <iostream>
#include <string>

using namespace std;

int main() {
  string str;
  cout << "Enter a string: ";
  cin >> str;

   int arr[26] = {0};
    for (int i = 0; i < str.size(); i++)
    {
        int ch = str[i] - 'a';
        arr[ch]++;
    }

  int max = 0;
  char ans;
  int i = 0;
  for ( i = 0; i < 26; i++) {
    if (arr[i] > max) {
      max = arr[i];
      ans = i;
    }
  }

  if(max==1)
  {
    cout<<"No max element every char is only appering one";
    return 0;
  }

  char pa=ans+'a';
  cout <<"The maximum occurence is of "<<pa<<" and it appere "<<max<<" times"<<endl;
  return 0;
}
