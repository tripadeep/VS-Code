#include <iostream>
using namespace std;
int main()
{
    int i = 10;
    const int &j = i;
    i = 890;
    cout << "i" << i << endl
         << "j" << j;
    return 0;
}