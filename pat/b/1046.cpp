#include <iostream>
using namespace std;
int main() {
    int t , a , b, c, d;
    int p = 0, q = 0;
    cin >> t;
    while (t--) {
        cin >> a >> b >> c >> d;
        if (a + c == b && a + c != d) {
            p++;
        }
        if (a + c != b && a + c == d) {
            q++;
        }
    }
    cout << q << " " << p << endl;
    return 0;
}