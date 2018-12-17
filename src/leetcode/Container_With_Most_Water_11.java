package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Container_With_Most_Water
 * @author shaoping
 * @date 2018/12/17
 * @url https://leetcode.com/problems/container-with-most-water/
 */
public class Container_With_Most_Water_11 {
	public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length - 1; i++) {
        	for (int j = i + 1; j < height.length; j ++) {
        		int area = Math.min(height[i], height[j]) * (j - i);
        		if (area > maxArea) {
        			maxArea = area;
        		}
        	}
        }
        return maxArea;
    }
	
	@Test
    public void test() {
		int[] input = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(input);
        Assert.assertEquals(49, result);
    }
}
