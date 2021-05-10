#include <cstdio>

struct Student{
    long long id;
    int seat;
}text[1010];

int main() {
    int n, b, c;
    long long a;
    scanf("%d", &n);
    while (n--) {
        scanf("%lld %d %d", &a, &b, &c);
        text[b].id = a;
        text[b].seat = c;
    }

    int k, s;
    scanf("%d", &k);
    for(int i = 0; i < k; i++) {
        scanf("%d", &s);
        printf("%lld %d\n", text[s].id, text[s].seat);

    }
    return 0;
}