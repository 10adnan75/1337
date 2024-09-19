// Memory limit exceeded :(
class Solution {
public:
    bool check(long long lo, long long hi, string s) {
        if (lo > hi) {
            return true;
        }
        if (s[lo] != s[hi]) {
            return false;
        }
        return check(lo+1, hi-1, s);
    }

    bool isPalindrome(string s) {
        string p = "";
        for (long long i=0; i<=s.length(); i++) {
            char c = s[i];
            if ((c>='A' && c<='Z') || (c>='a' && c<= 'z') || (c>='0' && c<='9')) {
                p += tolower(c);
            }
        }
        return check(0, p.length()-1, p);
    }
};

// Accepted
class Solution {
public:
    bool isPalindrome(string s) {
        string p = "";
        for (long long i=0; i<s.length(); i++) {
            char c = s[i];
            if ((c>='A' && c<='Z') || (c>='a' && c<= 'z') || (c>='0' && c<='9')) {
                p += tolower(c);
            }
        }
        for (long long i=0; i<p.length(); i++) {
            if (p[i] != p[p.length()-i-1]) {
                return false;
            }
        }
        return true;
    }
};