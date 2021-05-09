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
    int t = 0;
    for(int i = 0; i < n; i++) {
        t += a[i];
        if(t > sum) {
            sum = t;
        }else if(t < 0){
            t = 0;
        }
    }
    printf("%d\n", sum);

    return 0;
}