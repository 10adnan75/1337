class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int extraEnergy = 0, extraExp = 0, currExp = 0, totalEnergy = 0;
        for (int i : energy) {
            totalEnergy += i;
        }
        if (initialEnergy <= totalEnergy) {
            extraEnergy = totalEnergy - initialEnergy + 1;
        }
        for (int i : experience) {
            if (initialExperience <= i) {
                currExp = i - initialExperience + 1;
                initialExperience += currExp + i;
                extraExp += currExp;
            } else {
                initialExperience += i;
            }
        }
        return extraEnergy + extraExp;
    }
}
