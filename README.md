# Climbing-Stairs
Climbing Stairs Problem - How many ways I can climb to the nth stair using 1 or 2 steps.

The purpose of this class is to have two different ways on finding
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
