#include <iostream>
using namespace std;

int main() {

    int n;
    int a[100010];
    cin >> n;
    for(int i = 0; i < n; i++) {
        cin >> a[i];
    }
    int sum = 0;
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            int t = 0;
            for(int k = i; k <= j; k++) {
                t += a[k];
            }
            sum = max(sum , t);
        }
    }

    cout << sum << endl;

    return 0;
}