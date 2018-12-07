package gaoby;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author shaoping
 * @date 2018/12/7
 * @url https://leetcode.com/problems/binary-gap/
 */
public class Binary_Gap_868 {
    public int binaryGap(int N) {
        String binaryString = Integer.toBinaryString(N);
        int start = -1;
        int end = -1;
        boolean isFirstOne = true;
        int maxDistance = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) != '1') {
                continue;
            }
            if (isFirstOne) {
                start = i;
                isFirstOne = false;
            } else {
                end = i;
                int distance = end - start;
                if (distance > maxDistance) {
                    maxDistance = distance;
                }
                start = end;
            }
        }
        return maxDistance;
    }

    @Test
    public void test() {
        int result = binaryGap(5);
        Assert.assertEquals(result, 2);
    }
}
