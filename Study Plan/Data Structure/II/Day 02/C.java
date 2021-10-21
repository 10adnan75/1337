// Array - Runtime: 148 ms, Memory: 95.7 MB
/* class MyHashMap {
    
    int[] data;

    public MyHashMap() {
        data = new int[1000001];
        for (int i=0; i<data.length; i++) {
            data[i] = -1;
        }
    }
    
    public void put(int key, int value) {
        data[key] = value;
    }
    
    public int get(int key) {
        return data[key];
    }
    
    public void remove(int key) {
        data[key] = -1;
    }
} */ 

// Array (optimized) - Runtime: 77 ms, Memory: 96 MB
class MyHashMap {

    private int[] data;
    
    public MyHashMap() {
        this.data = new int[1000001];
    }
    
    public void put(int key, int value) {
        data[key] = value + 1;
    }
    
    public int get(int key) {
        return data[key] - 1;
    }
    
    public void remove(int key) {
        data[key] = 0;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
