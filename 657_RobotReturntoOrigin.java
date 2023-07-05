// Brute force, Runtime: 12 ms
class Solution {
    public boolean judgeCircle(String moves) {
        int countU = 0, countD = 0, countL = 0, countR = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'U' :
                    countU++;
                    break;
                case 'D' :
                    countD++;
                    break;
                case 'L' :
                    countL++;
                    break;
                case 'R' :
                    countR++;
                    break;
            }
        }
        return countU - countD == 0 && countR - countL == 0;
    }
}

// Simulation, Runtime: 10 ms
class Solution {
    public boolean judgeCircle(String moves) {
        int horizontal = 0, vertical = 0;
        for (int i=0; i<moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                vertical++;
            } else if (moves.charAt(i) == 'D') {
                vertical--;
            } else if (moves.charAt(i) == 'R') {
                horizontal++;
            } else {
                horizontal--;
            }
        }
        return vertical == 0 && horizontal == 0;
    }
}

// Using array, Runtime: 8 ms
class Solution {
    public boolean judgeCircle(String moves) {
        int[] origin = new int[4];
        for (int i=0; i<moves.length(); i++) {
            char c = moves.charAt(i);
            if (c == 'U') {
                origin[0]++;
            } else if (c == 'D') {
                origin[1]++;
            } else if (c == 'L') {
                origin[2]++;
            } else {
                origin[3]++;
            }
        }
        return origin[0] - origin[1] == 0 && origin[2] - origin[3] == 0;
    }
}
