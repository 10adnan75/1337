class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i=0; i<heights.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        sortPeopleDesc(heights);
        for (int i=0; i<names.length; i++) {
            names[i] = map.get(heights[i]);
        }
        return names;
    }

    public void sortPeopleDesc(int[] a) {
        int start = 0, end = a.length - 1;
        for (int i=0; i<a.length/2; i++) {
            int temp = a[start];
            a[start++] = a[end];
            a[end--] = temp;
        }
    }
}
