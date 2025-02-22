class Solution {
    public long maxWeight(int[] pizzas) {
        Arrays.sort(pizzas);

        int n = pizzas.length / 4;
        int evenDays = n / 2;
        int oddDays = n - evenDays;
        long answer = 0L;

        n = pizzas.length - 1;

        while (oddDays-- > 0) {
            answer += pizzas[n];
            n -= 1;
        }

        n--;

        while (evenDays-- > 0) {
            answer += pizzas[n];
            n -= 2;
        }

        return answer;
    }
}
