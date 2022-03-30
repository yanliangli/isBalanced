package com.demo;

import org.junit.Assert;
import org.junit.Test;

public class ParserTest {
    private Parser parser = new Parser();

    private static String TEST_VALID_INPUT_ONE = "";
    private static String TEST_VALID_INPUT_TWO = "{}()";
    private static String TEST_VALID_INPUT_THREE = "{()}";
    private static String TEST_VALID_INPUT_FOUR = "({()})";
    private static String TEST_VALID_INPUT_FIVE = "({})({({({()})})})()(({({({()})})}))";

    private static String TEST_INVALID_INPUT_ONE = "{}(";
    private static String TEST_INVALID_INPUT_TWO = "({)}";
    private static String TEST_INVALID_INPUT_THREE = "((";
    private static String TEST_INVALID_INPUT_FOUR = "}{";
    private static String TEST_INVALID_INPUT_FIVE = "({({({(({{({()})})}))})})})";

    private static String TEST_INVALID_CHARACHTER = "(abc)";

    @Test
    public void testIsBalancedSuccessOne() {
        boolean isBalanced = parser.isBalanced(TEST_VALID_INPUT_ONE);
        Assert.assertTrue(isBalanced);
    }

    @Test
    public void testIsBalancedSuccessTwo() {
        boolean isBalanced = parser.isBalanced(TEST_VALID_INPUT_TWO);
        Assert.assertTrue(isBalanced);
    }

    @Test
    public void testIsBalancedSuccessThree() {
        boolean isBalanced = parser.isBalanced(TEST_VALID_INPUT_THREE);
        Assert.assertTrue(isBalanced);
    }

    @Test
    public void testIsBalancedSuccessFour() {
        boolean isBalanced = parser.isBalanced(TEST_VALID_INPUT_FOUR);
        Assert.assertTrue(isBalanced);
    }

    @Test
    public void testIsBalancedSuccessFive() {
        boolean isBalanced = parser.isBalanced(TEST_VALID_INPUT_FIVE);
        Assert.assertTrue(isBalanced);
    }

    @Test
    public void testIsBalancedFailedOne() {
        boolean isBalanced = parser.isBalanced(TEST_INVALID_INPUT_ONE);
        Assert.assertFalse(isBalanced);
    }

    @Test
    public void testIsBalancedFailedTwo() {
        boolean isBalanced = parser.isBalanced(TEST_INVALID_INPUT_TWO);
        Assert.assertFalse(isBalanced);
    }

    @Test
    public void testIsBalancedFailedThree() {
        boolean isBalanced = parser.isBalanced(TEST_INVALID_INPUT_THREE);
        Assert.assertFalse(isBalanced);
    }

    @Test
    public void testIsBalancedFailedFour() {
        boolean isBalanced = parser.isBalanced(TEST_INVALID_INPUT_FOUR);
        Assert.assertFalse(isBalanced);
    }

    @Test
    public void testIsBalancedFailedFive() {
        boolean isBalanced = parser.isBalanced(TEST_INVALID_INPUT_FIVE);
        Assert.assertFalse(isBalanced);
    }
}
