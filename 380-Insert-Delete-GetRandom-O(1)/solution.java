public class RandomizedSet {

    /** Initialize your data structure here. */
    HashMap<Integer,Integer> map;
    int [] array;
    int cur;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>();
        array = new int [100];
        cur = 0;
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(cur == array.length){
            int size = 2 * array.length;
            int [] temp = new int [size];
            for(int i = 0; i < array.length; i++)
                temp[i] = array[i];
            array = temp;
        }
        if(map.containsKey(val))
            return false;
        array[cur++] = val;
        map.put(val, cur - 1);
        return true;
    }
    
    /** Deletes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val))
            return false;
        int index = map.get(val);
        int lastIndex = --cur;
        if(lastIndex >= 0)
            array[index] = array[lastIndex];
        map.put(array[lastIndex], index);
        map.remove(val);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int index = (int)Math.random() * cur;
        return array[index];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.delete(val);
 * int param_3 = obj.getRandom();
 */