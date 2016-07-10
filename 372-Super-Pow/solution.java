public class Solution {
    public int superPow(int a, int[] b) {
        long mod = (long) a;
        final long div = 1337L;
        final List<Integer> list = new ArrayList<>();
        final Set<Integer> used = new HashSet<>();
        int key;
        while (true) {
            mod %= div;
            key = (int) mod;
            // Is the list starting to repeat?
            if (used.contains(key)) break;
            list.add(key);
            used.add(key);
            mod *= a;
        }
        // Find the actual mod value from the list
        // BigInteger was used below to simplify (b mod list_size)
        // since this problem wasn't about large number division
        final StringBuilder sb = new StringBuilder();
        for (int d : b) sb.append(d);
        key = new BigInteger(sb.toString())
                .mod(BigInteger.valueOf(list.size())).intValue();
        if (key == 0) key = list.size();
        return list.get(key - 1);
        
    }
}