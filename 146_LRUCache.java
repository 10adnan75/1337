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

// Doubly Linked List
import java.util.HashMap;
import java.util.Map;

class DLL {
    protected int key;
    protected int value;
    protected DLL next;
    protected DLL prev;

    public DLL(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    private final int capacity;
    private final DLL head;
    private final DLL tail;
    private final Map<Integer, DLL> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.head = new DLL(-1, -1);
        this.tail = new DLL(-1, -1);
        this.head.next = this.tail;
        this.tail.prev = this.head;
        this.cache = new HashMap<>();
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        DLL node = cache.get(key);
        deleteNode(node);
        updateLRU(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            DLL node = cache.get(key);
            node.value = value;
            deleteNode(node);
            updateLRU(node);
            return;
        }
        if (cache.size() == this.capacity) {
            DLL tail = this.tail.prev;
            deleteNode(tail);
            cache.remove(tail.key);
        }
        DLL node = new DLL(key, value);
        updateLRU(node);
        cache.put(key, node);
    }

    public void updateLRU(DLL node) {
        node.next = this.head.next;
        node.prev = this.head;
        this.head.next.prev = node;
        this.head.next = node;
    }

    public void deleteNode(DLL node) {
        DLL prevNode = node.prev;
        DLL nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
}

/*
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
