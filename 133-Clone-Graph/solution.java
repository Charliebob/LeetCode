/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        HashMap<Integer, UndirectedGraphNode> map = new HashMap();
        if (node == null) return null;
        if (map.containsKey(node.label)) 
            return map.get(node.label);
        UndirectedGraphNode cloned = new UndirectedGraphNode(node.label);
        map.put(cloned.label, cloned);
        for(UndirectedGraphNode neighbor: node.neighbors){
            cloned.neighbors.add(cloneGraph(neighbor));
        }
        return cloned;

    }
}