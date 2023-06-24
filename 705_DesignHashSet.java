class MyHashSet {
    private int[] hashSet;

    public MyHashSet() {
        this.hashSet = new int[1000001];
        hashSet[0] = -1;
    }
    
    public void add(int key) {
        this.hashSet[key] = key;
    }
    
    public void remove(int key) {
        this.hashSet[key] = -1;
    }
    
    public boolean contains(int key) {
        return this.hashSet[key] == key;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
