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
        DFS(node, map);
    }
    private UndirectedGraphNode DFS(UndirectedGraphNode node,HashMap<Integer,UndirectedGraphNode> map){
        if(node==null) return null;
        if(map.containsKey(node.label)) return map.get(node.label);
        UndirectedGraphNode Gnode = new UndirectedGraphNode(node.label);
        map.put(Gnode.label, Gnode);
        for(UndirectedGraphNode neighbor: Gnode.neighbors){
            Gnode.neighbors.add(Gnode(neighbor));
        }
        return Gnode;
    }
}