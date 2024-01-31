class Solution {
    public Stack<Integer> createStack(int[] a) {
        Stack<Integer> s = new Stack<>();
        for (int i=a.length-1; i>=0; i--) {
            s.push(a[i]);
        }
        return s;
    }

    public Queue<Integer> createQueue(int[] a) {
        Queue<Integer> q = new LinkedList<>();
        for (int i: a) {
            q.offer(i);
        }
        return q;
    }

    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> s = createStack(sandwiches);
        Queue<Integer> q = createQueue(students);
        int c = 0;
        while (!s.empty()) {
            if (s.peek() != q.peek()) {
                c++;
                q.offer(q.poll());
            } else {
                c = 0;
                s.pop();
                q.poll();
            }
            if (c == s.size()) {
                break;
            }
        }
        return c;
    }
}
