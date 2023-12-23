class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> paths = new HashSet<>();
        paths.add("0:0");
        int x = 0, y = 0;
        for (char c: path.toCharArray()) {
            if (c == 'N') {
                y += 1;
            } else if (c == 'E') {
                x += 1;
            } else if (c == 'S') {
                y -= 1;
            } else {
                x -= 1;
            }
            String p = x+":"+y;
            if (!paths.contains(p)) {
                paths.add(p);
            } else {
                
                return true;
            }
        }
        return false;
    }
}
