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
