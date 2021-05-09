#include <stdio.h>
using namespace std;

int main() {
    int n;
    int a[100010];
    scanf("%d", &n);

    for(int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    int sum = 0;
    for(int i = 0; i < n; i++) {
        int t = 0;
        for(int j = i; j < n; j++) {
            t += a[j];
            if(sum < t) {
                sum = t;
            }
        }
    }
    printf("%d\n", sum);

    return 0;
}