class Solution {
    public int reverse(int num, int sum) {
		if(num == 0) {
		    return sum;
		}
		return(reverse(num/10, sum*10 + num%10));
    }
    
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        else if(x == reverse(x, 0)) return true;
        else return false;
    }
}
