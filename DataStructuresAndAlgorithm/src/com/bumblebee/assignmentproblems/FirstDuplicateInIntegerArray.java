package com.bumblebee.assignmentproblems;

/*
1) Did I understand the problem? Yes or No !!
        *         -> If No, Ask the person to provide more detail with example(s)
        *         -> If yes, go to next step !!
              --------Set of Questions to be asked--------
        *    What is the input(s)? --> In this program the input will be an integer array
        *    What is the expected output? --> First duplicate number in the array
        *    Do I have constraints to solve the problem? --> Ask for constraints (If need to follow specific
             1. Algorithm
             2. Time complexity
             3. Space complexity
        *    Do I have all information to go to next step!!
        *    How big is your test data set will be? --> Ask for the test data(input) size to select the appropriate solution
             (Eg., Whether size of the input array ) Usually from where to get the input either read from file or get in the runtime
2) Test data set
        *    Prepare the positive, negative and edge cases
        *    In this problem
             -----> Positive Cases - {2,4,6,4,12,6} --> 4
             -----> Negative Cases - {2,4,6,8},  {-1,1}, {}
             -----> Edge Cases - {7,3,5,5,7} 10, {3,5,7} 10

3) Do I know how to solve it?
        * Yes - Great, is there an alternate? -> Yes
        * No - Can I break down the problem into sub problems? -> Let's Assume,
        *       1. Sort the array
        *  		2. Iterate the array using for loop
        *  		3. check array[i] == array[i+1], if true then print the array[i] and break the loop

4) Ask for hint (if you do not know how to solve it?)
        *  		-> Ask one time and thank the interviewer
        *  		-> Worst Case! even after got the hint, we don't know how to solve, then convince them and prove with your confidence
        *  		   level to get the next question
        *

5) Do I know alternate solutions as well?
        * 	Yes - What are those?
        *   Way of Approach to solve with the following
        *   -> Brute Force (Standard) --> using for loop --> Without considering this Time complexity and space complexity,
        *   Other optimised solution
*/

import java.util.Arrays;

public class FirstDuplicateInIntegerArray {
    public static void main(String[] args) {
        int arr[] = {1, 6, 2, 2, 8, 12, 6};
        Arrays.sort(arr);
        for(int i=0; i<=arr.length;i++) {
            if(arr[i]==arr[i+1]) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
