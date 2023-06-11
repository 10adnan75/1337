// Memory Limit Exceeded
class SnapshotArray {
    private HashMap<Integer, List<Integer>> map;
    private int snapId;
    private int[] array;

    public SnapshotArray(int length) {
        map = new HashMap<>();
        snapId = 0;
        array = new int[length];    
    }
    
    public void set(int index, int val) {
        array[index] = val;
    }
    
    public int snap() {
        map.put(snapId, Arrays.stream(array).boxed().toList());
        return snapId++;
        // return snapId - 1;
    }
    
    public int get(int index, int snap_id) {
        return map.get(snap_id).get(index);
    }
}

// Binary Search
class SnapshotArray {
    private int snapId;
    private TreeMap<Integer, Integer>[] array;

    public SnapshotArray(int length) {
        snapId = 0;
        array = new TreeMap[length];
        for (int i=0; i<length; i++) {
            array[i] = new TreeMap<>();
            array[i].put(0, 0);
        }
    }
    
    public void set(int index, int val) {
        array[index].put(snapId, val);
    }
    
    public int snap() {
        return snapId++;
    }
    
    public int get(int index, int snapId) {
        return array[index].floorEntry(snapId).getValue();
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */
