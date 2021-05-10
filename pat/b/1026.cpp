#include <cstdio>

int main() {
    int c1 , c2;
    scanf("%d%d", &c1, &c2);
    // 转换为秒，四舍五入
    int k = c2 - c1;
    if(k%100 >= 50) {
        k = k/100 + 1;
    }else {
        k = k/100;
    }
    // %02d 表示数据宽度为 2 位，不足就左边补零。
    printf("%02d:%02d:%02d\n", k / 3600, k % 3600 / 60, k % 60);
    return 0;
}