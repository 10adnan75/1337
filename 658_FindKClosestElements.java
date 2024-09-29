import java.util.*;

class Solution {
    private interface IPair<Key, Value> extends Comparable<Pair<Key, Value>> {
        int compareTo(Pair that);
    }

    private static class Pair<Key, Value> implements IPair<Key, Value> {
        private Key key;
        private Value value;

        public Pair(Key k, Value v) {
            this.key = k;
            this.value = v;
        }

        public Key getKey() {
            return key;
        }

        public void setKey(Key key) {
            this.key = key;
        }

        public Value getValue() {
            return value;
        }

        public void setValue(Value value) {
            this.value = value;
        }

        @Override
        public int compareTo(Pair that) {
            if (this.key == that.key) {
                return ((Integer) that.value).compareTo((Integer) this.value);
            }
            return (Integer) this.key < (Integer) that.key ? 1 : -1;
        }
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>();
        for (int i: arr) {
            int diff = Math.abs(x-i);
            if (pq.size() == k) {
                assert pq.peek() != null;
                if (diff < pq.peek().getKey()) {
                    pq.poll();
                    pq.offer(new Pair<>(diff, i));
                }
            } else {
                pq.offer(new Pair<>(diff, i));
            }
        }
        List<Integer> l = new ArrayList<>();
        for (Pair<Integer, Integer> p: pq) {
            l.add(p.getValue());
        }
        Collections.sort(l);
        return l;
    }
}