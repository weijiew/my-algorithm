#include <cstdio>

int help(int a, int aa){
    int ta = 0;
    while(a != 0) {
        if(a%10 == aa) {
            ta = ta*10 + a%10;
        }
        a /= 10;
    }
    return ta;
}

int main() {
    int a, aa, b, bb;
    scanf("%d%d%d%d", &a, &aa, &b,&bb);

    int ta = help(a, aa);
    int tb = help(b, bb);
    printf("%d", ta + tb);
    return 0;
}