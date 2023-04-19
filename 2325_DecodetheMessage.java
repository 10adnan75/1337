class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder decodedMsg = new StringBuilder();
        HashMap<Character, Character> map = new HashMap<>();
        char index = 'a';
        for (int i=0; i<key.length(); i++) {
            char x = key.charAt(i);
            if (x == ' ' || map.containsKey(x)) {
                continue;
            }
            map.put(x, index++);
        }
        for (int i=0; i<message.length(); i++) {
            char x = message.charAt(i);
            if (x != ' ') {
                decodedMsg.append(map.get(x));
                continue;
            }
            decodedMsg.append(" ");
        }
        return decodedMsg.toString(); 
    }
}
