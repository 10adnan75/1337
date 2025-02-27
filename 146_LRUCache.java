// Brute force (TLE)
class LRUCache {
    private List<int[]> cache;
    private int capacity;

    public LRUCache(int capacity) {
        this.cache = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public int get(int key) {
        for (int i=0; i<this.cache.size(); i++) {
            if (this.cache.get(i)[0] == key) {
                int[] temp = this.cache.remove(i);
                this.cache.add(temp);
                return temp[1];
            }
        }

        return -1;
    }
    
    public void put(int key, int value) {
        for (int i=0; i<this.cache.size(); i++) {
            if (this.cache.get(i)[0] == key) {
                int[] temp = this.cache.remove(i);
                temp[1] = value;
                this.cache.add(temp);
                return;
            }
        }

        if (this.cache.size() == this.capacity) {
            this.cache.remove(0);
        }

        this.cache.add(new int[] {key, value});
    }
}
