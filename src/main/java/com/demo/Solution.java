package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Parser parser = new Parser();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string inputs: ");
        List<String> inputList = new ArrayList<>();
        String nextInput = scanner.nextLine();
        if (nextInput.isEmpty()) {
            return;
        }
        while (!nextInput.isEmpty()) {
            inputList.add(nextInput);
            nextInput = scanner.nextLine();
        }
        inputList.stream().map(parser::isBalanced).forEach(System.out::println);
    }
}

