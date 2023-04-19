/*
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0, i = 0;
        while (i < operations.length) {
            if ((operations[i].equals("X++")) || (operations[i].equals("++X"))) {
                count++;
            } 
            i++;
        }
        return  count * 2 - operations.length;
    }
}
*/

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0, i = 0;
        while (i < operations.length) {
            if (operations[i].charAt(1) == '+') {
                count++;
            } 
            i++;
        }
        return  count * 2 - operations.length;
    }
}
