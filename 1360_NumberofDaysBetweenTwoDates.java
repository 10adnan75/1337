// WA - need to work on this!
class Solution {
    int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(f(date1) - f(date2));
    }

    public int f(String date) {
        int days = 0, thisYear = Integer.valueOf(date.substring(0, 4)), thisMonth = Integer.valueOf(date.substring(5, 7)), thisDays = Integer.valueOf(date.substring(8, 10));
        for (int i=1900; i<thisYear; i++) {
            int ly = isLeap(i);
            days += 365 + ly; 
        }
        if (isLeap(thisYear) == 1 && thisMonth > 2) {
            days++;
        }
        for (int i=0; i<thisMonth; i++) {
            days += months[i];
        }
        days += thisDays;
        return days;
    }

    public int isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 == true ? 1 : 0; 
    }
}
