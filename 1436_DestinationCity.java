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
