# ArrayRotation
A left rotation operation on an array shifts each of the array's elements 1 unit to the left.

# Algorithm 
Step 1
The function rotLeft takes an array a and an integer d as input and returns a new array that is a left rotation of a by d positions.
Step 2
The function then checks for empty arrays. If d is 0 or the length of a is 0, then the function returns the original array a.
Step 3
The function then calculates the length of the array n.
It then handles the case where d is larger than the array size. i.e d % a.length(n).
Step 4
A new array rotatedArray with the same size as the original array a is created to store the rotated elements.
Step 5
The function then iterates(using a for loop) through the elements of the array a from the dth position to the end of the array.
Step 6
The function then iterates through the elements of the array a from the 0th position to the d - 1th position.
Step 7
Finally, the function returns the new array rotatedArray containing the left-rotated elements.

Example

Input:
int[] a = {1, 2, 3, 4, 5}; int d = 4;
Output:
5 1 2 3 4 The array [1, 2, 3, 4, 5] is rotated to the left by 4 positions, resulting in [5, 1, 2, 3, 4].

