#include <iostream>
using namespace std;
int main()
{
    //notes in page no:c4
    int a = 12;
    int *ptr = &a;
    int **ptrp=&ptr;
    cout << "The data of a using a: " << a << endl;
    cout << "The data of a using *ptr: " << *ptr << endl;   //single dereference
    cout << "The data of a using **ptrp: " << **ptrp << endl; //double dereference
    cout << "The add of a using &a: " << &a << endl;
    cout << "The add of a using ptr: " << ptr << endl;
    cout << "The add of ptr using &ptr: " << &ptr << endl;
    (*ptr)++;
    cout << "The incrementing value of ptr using (*ptr)++: " <<*ptr << endl;
    (a)++;
    cout << "The incrementing value of ptr using (a): " <<a<< endl;
    (**ptrp)++;
    cout << "The incrementing value of ptr using (*ptr)++: " <<**ptrp<< endl;

}