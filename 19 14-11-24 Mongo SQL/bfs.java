// Mr Sudhakar is playing a game on checkerboard of size INF*INF (INF -infinity), 
// where the indices starts from (-INF,-INF) and ends at (INF,INF). In one step, 
// he can move the box from position (p,q) to one of the following positions in L 
// shape like as follows: 
// 	- (p-2, q-1), (p-2, q+1), (p+2, q-1), (p+2, q+1)
// 	- (p-1, q+2), (p+1, q+2), (p-1, q-2), (p+1, q-2)

// Initially the box is at (0,0) position, and need to move the box to position (m,n).
// You will be given two integers m and n indicates the position(m,n).

// Now your task is to help by Mr Sudhakar to find the minimum number of steps 
// required to move the box from (0,0) to (m,n).


// Input Format:
// -----------------
// Two space separated integers, m and n, position.

// Output Format:
// ------------------
// Print an integer, minimum number of steps to reach (m,n).


// Sample Input-1:
// ---------------
// 2 4

// Sample Output-1:
// ----------------
// 2

// Explanation:
// -------------
// Initially, you are at (0,0) position, you can reach (2,4) as follows:
// (0,0) -> (1, 2) -> (2, 4) 


// Sample Input-2:
// ---------------
// 4 7

// Sample Output-2:
// ----------------
// 5

// Explanation:
// ------------
// Initially, you are at (0,0) position, you can reach (4,7) as follows:
// (0,0) -> (1, 2) -> (2, 4) -> (1, 6) -> (3, 5) -> (4, 7)
