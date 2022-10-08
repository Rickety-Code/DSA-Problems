public int trap(int[] height) {
    int[] maxWaterHoldCapacityLeft = new int[height.length];
    int[] maxWaterHoldCapacityRight = new int[height.length];

    maxWaterHoldCapacityLeft[0] = height[0];
    for(int i=1; i<height.length; i++) {
        maxWaterHoldCapacityLeft[i] = Math.max(maxWaterHoldCapacityLeft[i-1], height[i]);
    }

    maxWaterHoldCapacityRight[height.length-1] = height[height.length-1];
    for(int i=height.length-2; i>=0; i--) {
        maxWaterHoldCapacityRight[i] = Math.max(maxWaterHoldCapacityRight[i+1], height[i]);
    }

    int res = 0;
    for(int i=1; i<height.length-1; i++) {
        res += (Math.min(maxWaterHoldCapacityLeft[i], maxWaterHoldCapacityRight[i]) - height[i]);
    }

    return res;
}
