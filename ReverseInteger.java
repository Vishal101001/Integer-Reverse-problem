package com.interviewPrep;

import java.util.Scanner;

public class ReverseInteger {
	
    public static void main(String[] args) {
        // Input: 18794
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseInteger(number);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static int reverseInteger(int num) {
        int reversed = 0;

        // Loop until the number becomes 0
        while (num != 0) {
            int lastDigit = num % 10; // Extract the last digit
            reversed = reversed * 10 + lastDigit; // Build the reversed number
            num = num / 10; // Remove the last digit from the original number
        }

        return reversed;
    }
}


/*Input: 18794
Explanation:
Initial values:
num = 18794 (the input number)
reversed = 0 (initially, the reversed number is set to 0)
Step-by-step process:
Iteration 1:
Extract the last digit:
lastDigit = num % 10 = 18794 % 10 = 4 (we get the last digit of the number)
Update reversed number:
reversed = reversed * 10 + lastDigit = 0 * 10 + 4 = 4
Remove the last digit from the original number:
num = num / 10 = 18794 / 10 = 1879 (integer division removes the last digit)
Now:

num = 1879
reversed = 4
Iteration 2:
Extract the last digit:
lastDigit = num % 10 = 1879 % 10 = 9
Update reversed number:
reversed = reversed * 10 + lastDigit = 4 * 10 + 9 = 49
Remove the last digit:
num = num / 10 = 1879 / 10 = 187
Now:

num = 187
reversed = 49
Iteration 3:
Extract the last digit:
lastDigit = num % 10 = 187 % 10 = 7
Update reversed number:
reversed = reversed * 10 + lastDigit = 49 * 10 + 7 = 497
Remove the last digit:
num = num / 10 = 187 / 10 = 18
Now:

num = 18
reversed = 497
Iteration 4:
Extract the last digit:
lastDigit = num % 10 = 18 % 10 = 8
Update reversed number:
reversed = reversed * 10 + lastDigit = 497 * 10 + 8 = 4978
Remove the last digit:
num = num / 10 = 18 / 10 = 1
Now:

num = 1
reversed = 4978
Iteration 5:
Extract the last digit:
lastDigit = num % 10 = 1 % 10 = 1
Update reversed number:
reversed = reversed * 10 + lastDigit = 4978 * 10 + 1 = 49781
Remove the last digit:
num = num / 10 = 1 / 10 = 0
Now:

num = 0 (the loop will end here)
reversed = 49781 (this is the final reversed number)
Final output:
Reversed Number: 49781
Summary of each step:
We take the last digit of the original number and move it to the reversed number by multiplying the reversed number by 10 and adding the last digit.
We then remove the last digit from the original number and repeat the process until the number becomes 0.
For input 18794, the reversed number is 49781.*/
