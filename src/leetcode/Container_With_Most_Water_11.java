package leetcode;

import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;

/**
 * Container_With_Most_Water
 * @author gaoby
 * @date 2018/12/17
 * @url https://leetcode.com/problems/container-with-most-water/
 */
public class Container_With_Most_Water_11 {
	public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length - 1; i++) {
        	for (int j = i + 1; j < height.length; j++) {
        		int area = Math.min(height[i], height[j]) * (j - i);
        		if (area > maxArea) {
        			maxArea = area;
        		}
        	}
        }
        return maxArea;
    }
	
	public int maxArea2(int[] height) {
        int maxArea = 0;
        int low = 0;
        int high = height.length - 1;
        while (low < high) {
        	int min = Math.min(height[low], height[high]);
        	int area = (high - low) / min;
        	
        }
        return maxArea;
    }
	
	@Test
    public void test() {
		int[] input = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(input);
        Assert.assertEquals(49, result);
    }
	
	@Test
	public void test2() {
		boolean flag = Pattern.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$", "shaoping@pinduoduo..com");
		System.out.println(flag);
	}
}
