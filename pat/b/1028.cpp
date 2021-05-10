#include <iostream>
using namespace std;

int main() {
    int n, cnt = 0;
    string maxBirth = "1814/09/06", minBirth = "2014/09/06";
    string name, birth, maxName, minName;
    cin >> n;
    while (n--) {
        cin >> name >> birth;
        if(birth >= "1814/09/06" && birth <= "2014/09/06") {
            cnt++;
            if (birth >= maxBirth){
                maxName = name;
                maxBirth = birth;
            }

            if (birth <= minBirth) {
                minName = name;
                minBirth = birth;
            }
        }
    }

    cout << cnt;
    if (cnt != 0) {
        cout << " " << minName << " " << maxName << endl;
    }
    return 0;
}