// Memory: 38.9 MB
class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if ((num & 1) == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }
        return steps;
    }
}

// Memory: 39.5 MB
class Solution {
    private int steps = 0;

    public int numberOfSteps(int num) {
        if (num != 0) {
            steps++;
            if ((num & 1) == 0) {
                numberOfSteps(num / 2);
            } else {
                numberOfSteps(num - 1);
            }
        }
        return steps;
    }
}
