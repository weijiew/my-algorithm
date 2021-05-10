#include <iostream>
using namespace std;

int main() {
    float a[1010] = {0};
    float num;
    int n, m;
    int index;

    scanf("%d", &n);
    for(int i = 0; i < n; i++) {
        scanf("%d %f", &index, &num);
        a[index] += num;
    }

    scanf("%d", &m);
    for(int i = 0; i < m; i++) {
        scanf("%d %f", &index, &num);
        a[index] += num;
    }

    int cnt = 0;
    for(int i = 0; i < 1001; i++) {
        if(a[i] != 0) cnt++;
    }
    printf("%d", cnt);


    for(int i = 1000; i >= 0; i--) {
        if(a[i] != 0) {
                printf(" %d %.1f", i, a[i]);
        }
    }

    return 0;
}