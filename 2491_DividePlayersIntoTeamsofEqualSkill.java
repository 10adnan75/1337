class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int lo = 1, hi = skill.length-2;
        long ans = skill[lo-1]*skill[hi+1], sum = skill[lo-1]+skill[hi+1];
        while (lo < hi) {
            if (skill[lo] + skill[hi] != sum) {
                return -1;
            }
            ans += skill[lo] * skill[hi];
            lo++;
            hi--;
        }
        return ans;
    }
}
