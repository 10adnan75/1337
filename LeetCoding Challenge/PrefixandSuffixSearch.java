class WordFilter {
    HashMap<String, Integer> myMap = null;
    
    public WordFilter(String[] words) {
        myMap = new HashMap<>();
        int index = 0;
        for (String word: words) {
            for (int i=0; i<=word.length(); i++) {
                for (int j=0; j<=word.length(); j++) {
                    String split = word.substring(0, i) + " " + word.substring(j);
                    myMap.put(split, index);
                    //System.out.println(split + " " + index);
                }
            }
            index++;
        }
        //System.out.println(myMap);
    }
    
    public int f(String prefix, String suffix) {
        String str = prefix + " " + suffix;
        return myMap.getOrDefault(str, -1);
    }
}
