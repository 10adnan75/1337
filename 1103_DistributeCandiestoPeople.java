class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] people = new int[num_people];
        int candy = 1;
        boolean flag = false;
        while (true) {
            for (int i=0; i<num_people; i++) {
                if (candies - candy >= 0) {
                    candies -= candy;
                    people[i] += candy++;
                } else {
                    if (candies > 0) {
                        people[i] += candies;
                    }
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        return people;
    }
}
