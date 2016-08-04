public class RandomizedSet {

    /** Initialize your data structure here. */
    HashMap<Integer, Integer> map;
    public RandomizedSet() {
        map = new HashMap<Integer, Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!map.containsKey(val)){
            map.put(val, 1);
            return true;
        }
        return false;
    }
    
    /** Deletes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            map.remove((Integer)val);
            return true;
        }
        return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int index = (int)Math.random()*map.size();
        
        return map.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.delete(val);
 * int param_3 = obj.getRandom();
 */