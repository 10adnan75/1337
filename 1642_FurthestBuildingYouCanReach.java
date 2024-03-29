// 11/78 test cases passed
class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        System.out.println(laddersPQ(heights, bricks, ladders));
        System.out.println(bricksPQ(heights, bricks, ladders));
        return Math.max(laddersPQ(heights, bricks, ladders), bricksPQ(heights, bricks, ladders));
    }

    public int laddersPQ(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = heights.length;
        for (int i=1; i<n; i++) {
            int height = heights[i] - heights[i-1];
            if (height > 0) {
                pq.offer(height);
            }
        }
        int building = 0;
        for (int i=1; i<n; i++) {
            if (pq.isEmpty()) {
                return n-1;
            }
            int height = heights[i] - heights[i-1];
            if (height > 0) {
                if (pq.peek() == height) {
                    if (bricks - height >= 0) {
                        bricks = bricks - height;
                    } else if (ladders > 0) {
                        ladders--;
                    } else {
                        break;
                    }
                    pq.poll();
                } else if (pq.peek() > height) {
                    if (ladders > 0) {
                        ladders--;
                    } else if (bricks - height >= 0) {
                        bricks = bricks - height;
                    } else {
                        break;
                    }
                    pq.remove(height);
                } else {
                    break;
                }
            } 
            building++;
        }
        return building;
    } 

    public int bricksPQ(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = heights.length;
        for (int i=1; i<n; i++) {
            int height = heights[i] - heights[i-1];
            if (height > 0) {
                pq.offer(height);
            }
        }
        int building = 0;
        for (int i=1; i<n; i++) {
            if (pq.isEmpty()) {
                return n-1;
            }
            int height = heights[i] - heights[i-1];
            if (height > 0) {
                if (pq.peek() == height) {
                    if (ladders > 0) {
                        ladders--;
                    } else if (bricks - height >= 0) {
                        bricks = bricks - height;
                    } else {
                        break;
                    }
                    pq.poll();
                } else if (pq.peek() > height) {
                    if (bricks - height >= 0) {
                        bricks = bricks - height;
                    } else if (ladders > 0) {
                        ladders--;
                    } else {
                        break;
                    }
                    pq.remove(height);
                } else {
                    break;
                }
            } 
            building++;
        }
        return building;
    }
}

// 71/78 test cases passed
class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = heights.length;
        for (int i=1; i<n; i++) {
            int height = heights[i] - heights[i-1];
            if (height > 0) {
                pq.offer(height);
            }
        }
        int building = 0;
        for (int i=1; i<n; i++) {
            if (pq.isEmpty()) {
                return n-1;
            }
            int height = heights[i] - heights[i-1];
            if (height > 0) {
                if (pq.peek() == height) {
                    if (ladders > 0) {
                        ladders--;
                    } else if (bricks - height >= 0) {
                        bricks = bricks - height;
                    } else {
                        break;
                    }
                    pq.poll();
                } else if (pq.peek() > height) {
                    if (bricks - height >= 0) {
                        bricks = bricks - height;
                    } else if (ladders > 0) {
                        ladders--;
                    } else {
                        break;
                    }
                    pq.remove(height);
                } else {
                    break;
                }
            } 
            building++;
        }
        return building;
    }
}

// All test cases passed
class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=1; i<heights.length; i++) {
            int height = heights[i] - heights[i-1];
            if (height > 0) {
                bricks -= height;
                pq.offer(height);
                if (bricks < 0) {
                    bricks += pq.poll();
                    if (ladders > 0) {
                        ladders--;
                    } else {
                        return i-1;
                    }
                }
            }
        }
        return heights.length-1;
    }
}
