package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Parser parser = new Parser();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string inputs: ");
        String nextInput = scanner.nextLine();
        if (nextInput.isEmpty()) {
            return;
        }
        List<String> inputList = parseInput(scanner, nextInput);
        displayOutput(parser, inputList);
    }

    private static List<String> parseInput(Scanner scanner, String nextInput) {
        List<String> inputList = new ArrayList<>();
        while (!nextInput.isEmpty()) {
            inputList.add(nextInput);
            nextInput = scanner.nextLine();
        }
        return inputList;
    }

    private static void displayOutput(Parser parser, List<String> inputList) {
        inputList.stream().map(parser::isBalanced).forEach(System.out::println);
    }
}

