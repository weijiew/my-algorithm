#include <cstdio>

int main() {
    int a, b, c = 0;
    while (scanf("%d %d", &a, &b) != EOF) {
        if(b == 0) {
            break;
        }
        if(c == 0) {
            printf("%d %d", a * b, b - 1);
            c = 1;
        }else {
            printf(" %d %d", a * b, b - 1);
        }
    }

    if(c == 0) {
        printf("%d %d", 0, 0);
    }
    return 0;
}