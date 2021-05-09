#include <iostream>
#include <vector>

using namespace std;

void swap(vector<int>& v, int s , int e){
    e -= 1;
    while(s < e) {
        int t = v[s];
        v[s] = v[e];
        v[e] = t;
        s++, e--;
    }
}

int main() {
    int n , m;
    cin >> n >> m;
    vector<int> a(n , 0);

    for(int i = 0; i < n; i++) {
        cin >> a[i];
    }
    // 注意 m > n 的情况
    if(m > n) {
        m -= n;
    }

    swap(a , 0, n);
    swap(a , 0 , m);
    swap(a , m, n);

    for(int i = 0; i < n - 1; i++) {
        cout << a[i] << " ";
    }

    cout << a[n - 1] << endl;

    return 0;
}