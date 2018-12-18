package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Plus_One
 * @author gaoby
 * @date 2018/12/18
 * @url https://leetcode.com/problems/plus-one/
 */
public class Plus_One_66 {
	public int[] plusOne(int[] digits) {
		if (validate(digits)) {
			int[] ret = new int[digits.length + 1];
			ret[0] = 1;
			return ret;
		}
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
        	int sum = digits[i] + carry;
        	digits[i] = sum % 10;
        	carry = sum / 10;
        }
		return digits;
    }
	
	/**
	 * 判断数组元素是否都为9
	 * @param digits
	 * @return
	 */
	private boolean validate(int[] digits) {
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] != 9) {
				return false;
			}
		}
		return true;
	}
	
	@Test
	public void test() {
		int[] input = {4,3,2,1};
		int[] result = plusOne(input);
		Assert.assertEquals(2, result[result.length - 1]);
	}
}
