// My solution
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int delayedArrivalTime = arrivalTime + delayedTime;
        return delayedArrivalTime < 24 ? delayedArrivalTime : Math.abs(24 - delayedArrivalTime);
    }
}

// Using modulo operator
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }
}
