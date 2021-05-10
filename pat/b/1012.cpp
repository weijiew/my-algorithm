#include <cstdio>

int main() {
    int cnt[5] = {0};
    int ans[5] = {0};
    int n, t;
    scanf("%d",&n);
    for(int i = 0; i < n; i++) {
        scanf("%d", &t);
        if(t%5 == 0) {
            if(t%2== 0) {
                ans[0] += t;
                cnt[0]++;
            }
        }else if(t%5 == 1) {
            if(cnt[1]%2 == 0) {
                ans[1] += t;
            }else {
                ans[1] -= t;
            }
            cnt[1]++;
        }else if(t%5 == 2) {
            cnt[2]++;
        }else if(t%5 == 3) {
            ans[3] += t;
            cnt[3]++;
        }else if(t%5 == 4) {
            if(t > ans[4]) {
                ans[4] = t;
                cnt[4]++;
            }
        }
    }

    if(cnt[0] == 0) {
        printf("N ");
    }else {
        printf("%d ", ans[0]);
    }

    if(cnt[1] == 0) {
        printf("N ");
    }else {
        printf("%d ", ans[1]);
    }

    if(cnt[2] == 0) {
        printf("N ");
    }else {
        printf("%d ", cnt[2]);
    }

    if(cnt[3] == 0) {
        printf("N ");
    }else {
        printf("%.1f ", (double)ans[3] / cnt[3]);
    }

    if(cnt[4] == 0) {
        printf("N\n");
    }else {
        printf("%d\n", ans[4]);
    }

    return 0;
}