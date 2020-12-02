/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        int i = 0 , j = s.length() - 1;
        char[] temp = new char[s.length()];
        while (i <= j) {
            char a = s.charAt(i);
            char b = s.charAt(j);
            if (isVowel(a) && isVowel(b)) {
                temp[i++] = b;
                temp[j--] = a;                
            }else if (!isVowel(a)) {
                temp[i++] = a;
            }else {
                temp[j--] = b;
            }
        }
        return new String(temp);
    }

    public Boolean isVowel(char s) {
        if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' 
        ||  s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U') {
            return true;
        }
        return false;
    }
}
// @lc code=end

