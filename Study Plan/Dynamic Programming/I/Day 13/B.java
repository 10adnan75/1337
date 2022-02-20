class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        // Bottom-Up approach
        /* int[] dp = new int[triangle.size()];
        int n = triangle.size()-1;
        for (int i=0; i<triangle.get(n).size(); i++) {
            dp[i] = triangle.get(n).get(i);
        }
        for (int i=triangle.size()-2; i>=0; i--) {
            for (int j=0; j<triangle.get(i+1).size()-1; j++) {
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j+1]);
            }
        }
        return dp[0]; */
        
        // O(1) space
		if (triangle.size() > 1) {
			for (int i=triangle.size()-2; i>=0; i--) {
				for (int j=0; j<triangle.get(i).size(); j++) {
					int min = Math.min(triangle.get(i).get(j)+triangle.get(i+1).get(j), triangle.get(i).get(j)+triangle.get(i+1).get(j+1));
					triangle.get(i).set(j, min);
				}
			}
		}
		return triangle.get(0).get(0); 
    }
}
