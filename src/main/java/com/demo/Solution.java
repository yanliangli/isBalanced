package com.demo;

import com.demo.exception.IsBalancedParseException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private static final String VALID_INPUT_FORMAT = "[(){}]{0,49}";
    public static void main(String[] args) {
        Parser parser = new Parser();
        Scanner scanner = new Scanner(System.in);
        List<String> inputList;
        try {
            inputList = parseInput(scanner);
        } catch (IsBalancedParseException e) {
            System.out.println("Failed to parse user inputs. Error = " + e.getMessage());
            scanner.close();
            return;
        }
        displayOutput(parser, inputList);
        scanner.close();
    }

    /**
     * Parse user input using STDIN and return all input strings in an array list
     * @param scanner: scanner object to read STDIN
     * @return a list of input strings
     */
    private static List<String> parseInput(Scanner scanner) {
        System.out.println("Please enter string inputs: ");
        List<String> inputList = new ArrayList<>();
        String nextInput = scanner.nextLine();
        if (nextInput.isEmpty()) {
            throw new IsBalancedParseException("Invalid input");
        }
        while (!nextInput.isEmpty()) {
            if (!validateInput(nextInput)) {
                throw new IsBalancedParseException("Invalid input. Please enter input only consist (, ), {, and }, " +
                        "and ensure the total number of characters in each input string is less than 50.");
            }
            inputList.add(nextInput);
            nextInput = scanner.nextLine();
        }
        return inputList;
    }

    private static boolean validateInput(String nextInput) {
        return nextInput.matches(VALID_INPUT_FORMAT);
    }

    private static void displayOutput(Parser parser, List<String> inputList) {
        inputList.stream().map(parser::isBalanced).forEach(System.out::println);
    }
}

