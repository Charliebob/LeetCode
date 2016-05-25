public class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> intSet = new HashSet<>(nums.length);
        Set<Integer> seenTwice = new HashSet<>(nums.length);
        for(int n : nums) {
            if(!intSet.add(n)) {
                seenTwice.add(n);
            }
        }
        intSet.removeAll(seenTwice);
        return intSet.iterator().next();
    }
}