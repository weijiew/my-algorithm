#include <iostream>
using namespace std;

int main() {
    int a, b, c;
    int index = 0;
    cin >> a >> b >> c;
    int ans = a + b;
    int k[100];
    // 注意要特判 0  do while 不需要
    if (ans == 0) printf("0");
    while(ans) {
        k[index++] = ans%c;
        ans /= c;
    }
    for(int i = index - 1; i >= 0; i--) {
        cout << k[i];
    }
    return 0;
}