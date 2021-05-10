#include <iostream>
#include <algorithm>
using namespace std;
int main()
{
    string name, num, maxname, maxnum, minname, minnum;
    int n, score, maxscore = 0, minscore = 9999;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> name >> num >> score;
        if (score > maxscore)
        {
            maxscore = score;
            maxname = name;
            maxnum = num;
        }
        if (score < minscore)
        {
            minscore = score;
            minname = name;
            minnum = num;
        }
    }
    cout << maxname << " " << maxnum << endl;
    cout << minname << " " << minnum;
    return 0;
}