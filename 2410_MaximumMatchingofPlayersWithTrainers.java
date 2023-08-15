// TLE
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int c = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        for (int i=0; i<players.length; i++) {
            for (int j=0; j<trainers.length; j++) {
                if (players[i] <= trainers[j]) {
                    c++;
                    trainers[j] = 0;
                    break;
                }
            }
        }
        return c;
    }
}

// Accepted
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int c = 0, i = 0, j = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        while (i < players.length && j < trainers.length) {
            if (players[i] <= trainers[j]) {
                c++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return c;
    }
}
