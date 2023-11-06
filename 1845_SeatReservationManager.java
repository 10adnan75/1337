class SeatManager {
    boolean[] seats;
    boolean ur;
    int curr;

    public SeatManager(int n) {
        this.seats = new boolean[n];
        this.ur = false;
        this.curr = 0;
    }
    
    public int reserve() {
        if (this.ur) {
            for (int i=0; i<this.seats.length; i++) {
                if (!this.seats[i]) {
                    this.seats[i] = true;
                    return i+1;
                }
            }
        }
        this.seats[this.curr] = true;
        return ++this.curr;
    }
    
    public void unreserve(int seatNumber) {
        this.ur = true;
        this.seats[seatNumber-1] = false;
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
