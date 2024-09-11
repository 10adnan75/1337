class Solution {
    public int generateKey(int num1, int num2, int num3) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<4; i++) {
            sb.append(generate(num1%10, num2%10, num3%10));
            num1 /= 10; num2 /= 10; num3 /= 10;
        }
        return Integer.parseInt(sb.reverse().toString());
    }

    public int generate(int x, int y, int z) {
        return Math.min(Math.min(x, y), z);
    }
}