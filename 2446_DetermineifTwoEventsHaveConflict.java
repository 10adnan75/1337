// My code
class Solution {
    public boolean mergeIntervals(int x1, int y1, int x2, int y2) {
        return y1 >= x2 && y2 >= x1;
    }

    public boolean haveConflict(String[] event1, String[] event2) {
        int event1Start = (Integer.parseInt(event1[0].split(":")[0]) * 60) + Integer.parseInt(event1[0].split(":")[1]);;
        int event1End = (Integer.parseInt(event1[1].split(":")[0]) * 60) + Integer.parseInt(event1[1].split(":")[1]);
        int event2Start = (Integer.parseInt(event2[0].split(":")[0]) * 60) + Integer.parseInt(event2[0].split(":")[1]);
        int event2End = (Integer.parseInt(event2[1].split(":")[0]) * 60) + Integer.parseInt(event2[1].split(":")[1]);
        return mergeIntervals(event1Start, event1End, event2Start, event2End);
    }
}

// Efficient code
class Solution {
    public int convertToMinutes(String s) {
        return Integer.parseInt(s.substring(0, 2)) * 60 + Integer.parseInt(s.substring(3));
    }

    public boolean haveConflict(String[] event1, String[] event2) {
        return Math.max(convertToMinutes(event1[0]), convertToMinutes(event2[0])) <= Math.min(convertToMinutes(event1[1]), convertToMinutes(event2[1]));
    }
}
