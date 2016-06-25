# 366. Find Leaves of Binary Tree

[Original Page](https://leetcode.com/problems/find-leaves-of-binary-tree/)

Given a binary tree, find all leaves and then remove those leaves. Then repeat the previous steps until the tree is empty.

**Example:**  
Given binary tree  

<pre>          1
         / \
        2   3
       / \     
      4   5    
</pre>

Returns `[4, 5, 3], [2], [1]`.

**Explanation:**  

1\. Remove the leaves `[4, 5, 3]` from the tree

<pre>          1
         / 
        2          
</pre>

2\. Remove the leaf `[2]` from the tree

<pre>          1          
</pre>

3\. Remove the leaf `[1]` from the tree

<pre>          []         
</pre>

Returns `[4, 5, 3], [2], [1]`.

**Credits:**  
Special thanks to [@elmirap](https://discuss.leetcode.com/user/elmirap) for adding this problem and creating all test cases.

<div>

<div id="company_tags" class="btn btn-xs btn-warning">Show Company Tags</div>

<span class="hidebutton">[LinkedIn](/company/linkedin/)</span></div>

<div>

<div id="tags" class="btn btn-xs btn-warning">Show Tags</div>

<span class="hidebutton">[Tree](/tag/tree/) [Depth-first Search](/tag/depth-first-search/)</span></div>