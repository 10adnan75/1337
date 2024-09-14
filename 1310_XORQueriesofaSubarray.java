// Brute force: TLE
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            int xor = arr[i];
            map.put(i+","+i, xor);
            for (int j=i+1; j<arr.length; j++) {
                xor ^= arr[j];
                map.put(i+","+j, xor);
            }
        }
        int[] ans = new int[queries.length];
        int i = 0;
        for (int[] query: queries) {
            ans[i++] = map.get(query[0]+","+query[1]);
        }
        return ans;
    }
}

// Prefix sum: Accepted
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {        
        int[] ans = new int[queries.length];
        int id = 0;
        for (int[] query: queries) {
            int xor = arr[query[0]];
            for (int i=query[0]+1; i<=query[1]; i++) {
                xor ^= arr[i];
            }
            ans[id++] = xor;
        }
        return ans;
    }
}