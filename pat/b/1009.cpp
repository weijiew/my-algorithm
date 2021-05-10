#include <iostream>
#include <vector>
using namespace std;

int main() {
    string a;
    vector<string> v;

    for(int i = 0;; i++) {
        cin >> a;
        v.push_back(a);
        if(cin.get() == '\n') break;
    }

    for(int i = v.size() - 1; i > 0; i--) {
        cout << v[i] << " ";
    }

    cout << v[0] << endl;

    return 0;
}