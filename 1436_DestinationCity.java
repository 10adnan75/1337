// 9 ms
class Solution {
    public String destCity(List<List<String>> paths) {
        int i = 0;
        String finalDestination = new String();
        for (List<String> path : paths) {
            String destination = path.get(1);
            boolean found = false;
            for (List<String> source : paths) {
                if (destination.equals(source.get(0))) {
                    found = true;
                }
            }
            if (!found) {
                finalDestination = destination;
                break;
            }
        }
        return finalDestination;
    }
}

// 2 ms
class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (List<String> path: paths) {
            set.add(path.get(0));
        }        
        for (List<String> path: paths) {
            if (!set.contains(path.get(1))) {
                return path.get(1);
            }
        }
        return "";
    }
}
