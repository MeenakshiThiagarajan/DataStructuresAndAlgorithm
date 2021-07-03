package com.bumblebee.assignmentproblems;

/*
1) Did I understand the problem? Yes or No !!
        *         -> If No, Ask the person to provide more detail with example(s)
        *         -> If yes, go to next step !!
              --------Set of Questions to be asked--------
        *    What is the input(s)? --> In this program the input will be a integer
        *    What is the expected output? --> Integer with reversed digits of the given integer
        *    Do I have constraints to solve the problem? --> Ask for constraints (If need to follow specific
             1. Algorithm
             2. Time complexity
             3. Space complexity
        *    Do I have all information to go to next step!!
        *    How big is your test data set will be? --> Ask for the test data(input) size to select the appropriate solution
             (Eg., Whether input is 5 or 10 digits ) Usually from where to get the input either read from file or get in the runtime
2) Test data set
        *    Prepare the positive, negative and edge cases
        *    In this problem
             -----> Positive Cases - 121 -> 12
             -----> Negative Cases - If reversing the digits exceeds the integer k=limit then return false
             -----> Edge Cases - 12000 -> 21

3) Do I know how to solve it?
        * Yes - Great, is there an alternate? -> Yes
        * No - Can I break down the problem into sub problems? -> Let's Assume,
        *  	 If interviewer ask to solve without using string,
        *       1. to use while loop (if its unknown length of the integer -> iterations are unknown)
        *  		2. create a variable for and initialize as same value as input (121).
        *  		3. Create a variable for to store the reminder and initialize as 'zero'.
        *  		4. use modulus to get the reminder values (E.g., Itr 1: 121%10 = 1 Itr 2 : 12% Itr 3: 1%10 = 1)
        *  		5. assign this reminder values to the created variable (step 3)
        *  		6. Print the reversed integer

4) Ask for hint (if you do not know how to solve it?)
        *  		-> Ask one time and thank the interviewer
        *  		-> Worst Case! even after got the hint, we don't know how to solve, then convince them and prove with your confidence
        *  		   level to get the next question
        *

5) Do I know alternate solutions as well?
        * 	Yes - What are those?
        *   Way of Approach to solve with the following
        *   -> Brute Force (Standard) --> using while loop, inbuilt approach using String, Collections --> Without considering this Time complexity and space complexity,
        *   Other optimised solutions
*/


public class ReverseTheInteger {
    public static void main(String[] args)
    {
        // Method 1: Mod method
        int numTobeReversed = 12345;
        int temp = numTobeReversed;
        int reversedNum = 0;
        int rem = 0;

        while(temp>0) {
            rem = temp % 10;
            reversedNum = reversedNum * 10 + rem;
            temp = temp / 10;

        }

        System.out.println(reversedNum);


        //Method 2: String conversion method
        String str = Integer.toString(numTobeReversed);

        String str1 = "";

        for (int i = str.length()-1; i >= 0; i--)
        {
            str1 = str1+ str.charAt(i);
        }

        System.out.println(str1);
    }
}
