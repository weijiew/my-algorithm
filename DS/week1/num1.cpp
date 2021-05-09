#include <stdio.h>
using namespace std;

int main() {
    int n;
    int a[100010];
    scanf("%d", &n);

    for(int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    int t = 0, sum = -1;
    int si = 0, ei = 0, ti = 0;
    for(int i = 0; i < n; i++) {
        t += a[i];
        if(t > sum) {
            sum = t;
            si = ti;
            ei = i;
        }else if(t < 0) {
            t = 0;
            ti = i + 1;
        }
    }

    if(sum < 0) printf("%d %d %d\n", 0, a[0], a[n - 1]);
    else printf("%d %d %d\n", sum, a[si], a[ei]);
    return 0;

}