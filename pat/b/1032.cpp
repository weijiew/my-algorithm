#include <cstdio>

int main() {
    int n, c, d, index = 0;;
    int a[100010] = {0};

    scanf("%d", &n);
    for(int i = 0; i < n; i++) {
        scanf("%d %d", &c, &d);
        a[c] += d;
    }

    int k = 1, maxScore = 0;
    for(int i = 1; i <= n; i++) {
        if(a[i] > maxScore) {
            maxScore = a[i];
            k = i;
        }
    }

    printf("%d %d\n", k, maxScore);
    return 0;
}