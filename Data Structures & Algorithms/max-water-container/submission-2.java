class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max = Integer.MIN_VALUE;

        while (left < right) {
            int w = right - left;
            int h = Math.min(heights[left], heights[right]);
            int Area = w * h;
            max = Math.max(Area, max);

            if (heights[left] < heights[right])
                left++;
            else
                right--;
        }

        return max;
    }
}
