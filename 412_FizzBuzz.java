// Memory: 44 MB
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        int i=1;
        while (i <= n) {
            if ((i % 3) == 0 && (i % 5) == 0) {
                ans.add("FizzBuzz");
            } else if ((i % 3) == 0) {
                ans.add("Fizz");
            } else if ((i % 5) == 0) {
                ans.add("Buzz");
            } else {
                ans.add(Integer.toString(i));
            }
            i++;
        }
        return ans;
    }
}

// Memory: 43.7 MB
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            ans.add(i % 15 == 0 ? "FizzBuzz" : i % 5 == 0 ? "Buzz" : i % 3 == 0 ? "Fizz" : String.valueOf(i));
        }
        return ans;
    }
}
