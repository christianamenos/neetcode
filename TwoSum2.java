import java.util.Arrays;

public class TwoSum2 {

    public static void main(String[] args) {
        /*
         * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
         */

        System.out.println((2 - 1) / 2 + 1);
        System.out.println((2+1) / 2);

        int[] input1 = {2, 7, 11, 15};
        int[] input2 = {2, 3, 4};
        int[] input3 = {-1, 0};

        System.out.println(Arrays.toString(pairsSummingTarget(input1, 9)));
        // System.out.println(Arrays.toString(pairsSummingTarget(input2, 6)));
        // System.out.println(Arrays.toString(pairsSummingTarget(input3, -1)));
    }

    public static int[] pairsSummingTarget(int[]numbers, int target) {
        int immediatelyEqualOrLower = findLowerValueIndex(numbers, target, 0, numbers.length - 1);
        System.out.println(immediatelyEqualOrLower);
        return new int[0];
    }

    public static int findLowerValueIndex(int []numbers, int target, int leftBound, int rightBound) {
        int middle = (rightBound - leftBound) / 2 + leftBound;
        // int middle = (rightBound + leftBound) / 2;
        System.out.println("---");
        System.out.println((rightBound - leftBound) / 2);
        System.out.println((rightBound - leftBound) / 2 + leftBound);
        System.out.println((rightBound + leftBound) / 2);
        System.out.println(middle);
        System.out.println(leftBound);
        System.out.println(rightBound);
        System.out.println("---");
        if (leftBound >= rightBound) return middle;
        if (numbers[middle] >= target) {
            return findLowerValueIndex(numbers, target, leftBound, middle - 1);
        }
        if (numbers[middle] < target) {
            return findLowerValueIndex(numbers, target, middle + 1, rightBound);
        }
        return -1;
    }
}
