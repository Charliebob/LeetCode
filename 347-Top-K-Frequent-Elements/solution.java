public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new LinkedList<Integer>();
        if(k<1) return result;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])) hm.put(nums[i],hm.get(nums[i])+1);
            else hm.put(nums[i],1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            pq.offer(entry);
            if(pq.size()>k) pq.poll();
        }
        while(!pq.isEmpty()){
            result.add(0,pq.poll().getKey());
        }
        return result;
        
    }
}