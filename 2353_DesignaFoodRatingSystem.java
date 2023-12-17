// TLE :(
class FoodRatings {
    public HashMap<String, Integer> foodRatings;
    public HashMap<String, List<String>> cuisineFoods;
    public List<String> foods;
    public String maxRated;
    public int N;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        this.N = foods.length;
        this.foodRatings = new HashMap<>();
        this.cuisineFoods = new HashMap<>();

        for (int i=0; i<N; i++) {
            this.foodRatings.put(foods[i], ratings[i]);
        }

        for (int i=0; i<N; i++) {
            String key = cuisines[i], value = foods[i];
            if (this.cuisineFoods.containsKey(key)) {
                this.foods = this.cuisineFoods.get(key);
                this.foods.add(value);
            } else {
                this.foods = new ArrayList<>() {{ add(value); }};
            }
            this.cuisineFoods.put(key, this.foods);
        }
    }
    
    public void changeRating(String food, int newRating) {
        this.foodRatings.put(food, newRating);
    }
    
    public String highestRated(String cuisine) {
        this.N = 0;
        this.foods = this.cuisineFoods.get(cuisine);
        for (String food: this.foods) {
            int rating = this.foodRatings.get(food);
            if (rating >= N) {
                if (rating == N) {
                    this.maxRated = getMaxRated(this.maxRated, food);
                } else {
                    N = rating;
                    this.maxRated = food;
                }
            }
        }
        return this.maxRated;
    }

    public String getMaxRated(String a, String b) {
        int i = 0;
        while (i < Math.min(a.length(), b.length())) {
            int x = a.charAt(i), y = b.charAt(i);
            if (x != y) {
                return x > y ? b : a;
            }
            i++;
        }
        return "";
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */

// PriorityQueue
class Food implements Comparable<Food> {
    public int rating;
    public String name;

    public Food(int rating, String name) {
        this.rating = rating;
        this.name = name;
    }

    public int compareTo(Food other) {
        if (this.rating == other.rating) {
            return this.name.compareTo(other.name);
        }
        return Integer.compare(this.rating, other.rating) * -1;
    }
}

class FoodRatings {
    private Map<String, Integer> foodRatings;
    private Map<String, String> foodCuisines;
    private Map<String, PriorityQueue<Food>> M;
    public int N;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        this.N = foods.length;
        this.foodRatings = new HashMap<>();
        this.foodCuisines = new HashMap<>();
        this.M = new HashMap<>();
        for (int i=0; i<N; i++) {
            this.foodRatings.put(foods[i], ratings[i]);
            this.foodCuisines.put(foods[i], cuisines[i]);
            M.computeIfAbsent(cuisines[i], k -> new PriorityQueue<>()).add(new Food(ratings[i], foods[i]));
        }
    }
    
    public void changeRating(String food, int newRating) {
        this.foodRatings.put(food, newRating);
        this.M.get(this.foodCuisines.get(food)).add(new Food(newRating, food));
    }
    
    public String highestRated(String cuisine) {
        Food highestRated = M.get(cuisine).peek();
        while (foodRatings.get(highestRated.name) != highestRated.rating) {
            M.get(cuisine).poll();
            highestRated = M.get(cuisine).peek();
        }        
        return highestRated.name;
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */
