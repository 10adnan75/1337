class OrderedStream {
    String[] stream;

    public OrderedStream(int n) {
        this.stream = new String[n + 1];
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> stream = new ArrayList<>();
        this.stream[idKey] = value;
        for (int i=1; i<this.stream.length; i++) {
            if (this.stream[i] == null) {
                break;
            } else if (this.stream[i] == " ") {
                continue;
            } else {
                stream.add(this.stream[i]);
                this.stream[i] = " ";
            }
        }
        return stream;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
