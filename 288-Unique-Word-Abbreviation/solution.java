public class ValidWordAbbr {
    
    Map<String, Set<String>> map = new HashMap<>();

    public ValidWordAbbr(String[] dictionary) {
        // build the hashmap
        // the key is the abbreviation
        // the value is a hash set of the words that have the same abbreviation
        for(int i = 0; i < dictionary.length; i++) {
           String a = abbr(dictionary[i]);
           Set<String> set = map.containsKey(a) ? map.get(a) : new HashSet<>();
           set.add(dictionary[i]);
           map.put(a, set);
        }
    }

    public boolean isUnique(String word) {
        String a = abbr(word);
        // it's unique when the abbreviation does not exist in the map or
        // it's the only word in the set
        return !map.containsKey(a) || (map.get(a).contains(word) && map.get(a).size() == 1);
    }
    
    private String abbr(String s) {
        if (s.length() < 3) return s;
        return s.charAt(0)+Integer.toString(s.length()-2)+s.charAt(s.length()-1);
    }
}


// Your ValidWordAbbr object will be instantiated and called as such:
// ValidWordAbbr vwa = new ValidWordAbbr(dictionary);
// vwa.isUnique("Word");
// vwa.isUnique("anotherWord");