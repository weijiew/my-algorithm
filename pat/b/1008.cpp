#include <iostream>
using namespace std;
int main() {
    int a[110];
    int n, m;
    cin >> n >> m;
    // 要保证 m < n
    m = m % n;
	for (int i = m; i < n; i ++) {
            cin >> a[i];
    }
    for (int i = 0 ; i < m ; i ++) {
    	cin >> a[i];
	}
    for (int j = 0; j < n; j ++) {
        if (j < n-1) {
            cout << a[j] << " ";
        }else {
            cout << a[j] << endl;
        }
    }
    return 0;
}
```