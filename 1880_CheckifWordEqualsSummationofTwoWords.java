class Solution {
    public int get(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            sb.append(s.charAt(i)-'a');
        }
        return Integer.valueOf(sb.toString());
    }

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return get(firstWord) + get(secondWord) == get(targetWord);
    }
}

// Another approach
class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int i = firstWord.length()-1, j = secondWord.length()-1, k = targetWord.length()-1, carry = 0;
        while (i>-1 || j>-1 || k>-1) {
            int first = i == -1 ? 0 : (int)firstWord.charAt(i--)-'a';
            int second = j == -1 ? 0 : (int)secondWord.charAt(j--)-'a';
            int third = k == -1 ? 0 : (int)targetWord.charAt(k--)-'a';
            int sum = first + second;
            if ((sum+carry)%10 != third) {
                return false;
            }
            carry = sum+carry > 9 ? 1 : 0;
        }
        if (carry==1 && i==-1 && j==-1 && k==-1) {
            return false;
        }
        return true;
    }
}
