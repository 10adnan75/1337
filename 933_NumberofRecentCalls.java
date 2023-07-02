// TLE
class RecentCounter {
    private List<Integer> requests;

    public RecentCounter() {
        requests = new ArrayList<>();
    }
    
    public int ping(int t) {
        int counter = 0;
        requests.add(t);
        for (int request : requests) {
            if (request >= t - 3000 && request <= t) {
                counter++;
            }
        }
        return counter;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */

// Sliding Window
class RecentCounter {
    private LinkedList<Integer> requests;            

    public RecentCounter() {
        this.requests = new LinkedList<>();
    }
    
    public int ping(int t) {
        this.requests.addLast(t);
        while (this.requests.getFirst() < t - 3000) {
            this.requests.removeFirst();
        }
        return this.requests.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
