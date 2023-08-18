// Need to work on this since this code is producing a wrong output!
// class Solution {
//     public boolean checker(char c) {
//         return (c-'0'<=9 && c-'0'>=0) || (c == '-') || (c == '!') || (c == '.') || (c == ',');
//     }

//     public boolean isValid(String word) {
//         for (int i=0; i<word.length(); i++) {
//             if (checker(word.charAt(i))) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public int countValidWords(String sentence) {
//         int c = 0;
//         for (String word : sentence.split(" ")) {
//             if (word.equals("")) {
//                 continue;
//             }
//             if (isValid(word)) {
//                 c++;
//             }
//         }
//         return c;
//     }
// }

// Python code (Accepted solution)
