class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int aliceA = Integer.valueOf(arriveAlice.substring(3));
        int bobA = Integer.valueOf(arriveBob.substring(3));
        int aliceL = Integer.valueOf(leaveAlice.substring(3));
        int bobL = Integer.valueOf(leaveBob.substring(3));
        for (int i=0; i<Integer.valueOf(arriveAlice.substring(0, 2))-1; i++) {
            aliceA += month[i];
        }
        for (int i=0; i<Integer.valueOf(arriveBob.substring(0, 2))-1; i++) {
            bobA += month[i];
        }
        for (int i=0; i<Integer.valueOf(leaveAlice.substring(0, 2))-1; i++) {
            aliceL += month[i];
        }
        for (int i=0; i<Integer.valueOf(leaveBob.substring(0, 2))-1; i++) {
            bobL += month[i];
        }
        int ans = Math.min(aliceL, bobL) - Math.max(aliceA, bobA) + 1;
        return ans <= 0 ? 0 : ans; 
    }
}
