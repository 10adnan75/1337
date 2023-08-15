class Solution {
    public int hardestWorker(int n, int[][] logs) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxDiff = Integer.MIN_VALUE, emp = 0, prev = 0;
        for (int i=0; i<logs.length; i++) {
            if (logs[i][1] - prev >= maxDiff) {
                emp = logs[i][0];
                maxDiff = logs[i][1] - prev;
                if (map.containsKey(emp)) { 
                    if (map.get(emp) < maxDiff) {
                        map.put(emp, maxDiff);
                    }
                } else {
                    map.put(emp, maxDiff);
                }
            }
            prev = logs[i][1];
        }
        for (Map.Entry entry : map.entrySet()) {
            if ((int)entry.getValue() == maxDiff && (int)entry.getKey() < emp)
                emp = (int)entry.getKey();
        }
        return emp;
    }
}
