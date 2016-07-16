public class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new LinkedList<Integer>();
        int maxArea = 0;
        int area = 0;
        int i;
        for(i=0; i < heights.length;){
            if(stack.isEmpty() || heights[stack.peekFirst()] <= heights[i]){
                stack.offerFirst(i++);
            }else{
                int top = stack.pollFirst();
                //if stack is empty means everything till i has to be
                //greater or equal to heights[top] so get area by
                / heights[top] * i;
                if(stack.isEmpty()){
                    area = heights[top] * i;
                }
                //if stack is not empty then everythin from i-1 to heights.peek() + 1
                //has to be greater or equal to heights[top]
                //so area = heights[top]*(i - stack.peek() - 1);
                else{
                    area = heights[top] * (i - stack.peekFirst() - 1);
                }
                if(area > maxArea){
                    maxArea = area;
                }
            }
        }
        while(!stack.isEmpty()){
            int top = stack.pollFirst();
            //if stack is empty means everything till i has to be
            //greater or equal to heights[top] so get area by
            //heights[top] * i;
            if(stack.isEmpty()){
                area = heights[top] * i;
            }
            //if stack is not empty then everything from i-1 to heights.peek() + 1
            //has to be greater or equal to heights[top]
            //so area = heights[top]*(i - stack.peek() - 1);
            else{
                area = heights[top] * (i - stack.peekFirst() - 1);
            }
        if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
}