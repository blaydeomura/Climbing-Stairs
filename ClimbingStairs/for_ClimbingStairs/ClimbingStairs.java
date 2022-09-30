package for_ClimbingStairs;
/**
 * lab01 - Dynamic Programming
 * @BlaydeOmura
 * 29 August 2022
 * 
 * The purpose of this class is to have two different ways on finding
 * all of the possible ways to reach the "nth" stair using 1 step or 2 steps.
 * 
 * The "n" parameter stands for the "nth" stair. This means the amount of stairs
 * that we will climb to. For example, if n = 4, this program will find all
 * of the ways we can climb to the 4th stair using 1 step or 2 steps
 * 
 * Function climbStairsRecursive(int n) finds all of the ways to reach
 * the nth stair recursively. This function follows the principle of the
 * Fibonacci sequence.
 * 
 * Function climbStairsIterative(int n) finds all of the ways to reach the nth
 * stair in an iterative. This function creates an array, fills out each 
 * sequential index position by adding the [n-1] + [n-2] index positions.
 * Also using the principle of the Fibonacci sequence. 

*/

public class ClimbingStairs {

    public static int climbStairsRecursive(int n) {
    	if(n<0 || n>45) { //Check to see if user input is between 1 and 45
    		throw new UnsupportedOperationException("Value of stairs must be between 1 and 45"); //throw exception if not between 1 and 45
    	} 
    	if(n==0 || n==1 ) { // n = 0, 1; our base cases. When n==0||n==1, can only return 1
    		return 1; 
    	}
    	else { //when n!=0 || n!=1, call call the two preceding stairs to get the value of n. Fibonacci numbers
    		return climbStairsRecursive(n-1) + climbStairsRecursive(n-2);
    	}
    }

    public static int climbStairsIterative(int n) {
        if(n < 0 || n > 45) {
        	throw new UnsupportedOperationException("Value of stairs must be between 1 and 45");
        }
        int[] stairsAmountArray = new int[n+1]; // creating array n+1
        stairsAmountArray[0] = 1; //index 0 is 1
        stairsAmountArray[1] = 1; //index 1 is 1
        for(int i = 2; i < stairsAmountArray.length; i++) { //start at index 2, fill out array
        	stairsAmountArray[i] = stairsAmountArray[i-1] + stairsAmountArray[i-2]; //array[i] is the sum of the prev 2 numbers
        }
        return stairsAmountArray[n]; //return the value of n in array
    }

    public static void main(String[] args) {
    	System.out.println(climbStairsRecursive(1));
    	System.out.println(climbStairsIterative(1));
    	
    	System.out.println(climbStairsRecursive(2));
    	System.out.println(climbStairsRecursive(2));
    	
    	System.out.println(climbStairsRecursive(3));
    	System.out.println(climbStairsRecursive(3));
    	
    	
    }
}
