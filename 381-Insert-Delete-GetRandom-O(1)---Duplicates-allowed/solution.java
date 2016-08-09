public class RandomizedCollection {

    /** Initialize your data structure here. */
    private Map<Integer, Set<Integer>> map;
    private List<Integer> nums;
    private java.util.Random random;

    /** Initialize your data structure here. */
    public RandomizedCollection() {
        map = new HashMap<>();
        nums = new ArrayList<>();
        random = new java.util.Random();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        boolean res = false;
        if (!map.containsKey(val)) {
            res = true;
            map.put(val, new HashSet<>());
        }
        map.get(val).add(nums.size());
        nums.add(val);
        return res;
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        
        Set<Integer> indexs = map.get(val);
        int index = indexs.iterator().next();
        if (indexs.size() == 1) {
            map.remove(val);
        } else {
            indexs.remove(index);
        }
        if (index < nums.size() - 1) {
            nums.set(index, nums.get(nums.size() - 1));
            map.get(nums.get(nums.size() - 1)).remove(nums.size() - 1);
            map.get(nums.get(nums.size() - 1)).add(index);
        }
        nums.remove(nums.size() - 1);  
        return true;
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
        return nums.get(random.nextInt(nums.size()));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */