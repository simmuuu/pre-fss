// To maximize energy efficiency and lighting optimization, you are allowed to perform 
// an operation multiple times:
// 	You can choose any row or column of the grid and toggle all the bulbs in 
// 	that row or column. Toggling means:
// 		- Bulbs that are ON (1) will turn OFF (0).
// 		- Bulbs that are OFF (0) will turn ON (1).

// Each row in the grid can be interpreted as a binary number, where the leftmost bulb 
// is the most significant bit and the rightmost bulb is the least significant bit. 
// The goal is to maximize the sum of these binary numbers for all rows in the grid, 
// after performing any number of toggles on the grid.

// Your task is to find the highest possible score, which is the maximum sum of all 
// the binary numbers that can be obtained after optimizing the grid through these 
// toggling operations.

// Input Format:
// -------------
// Line-1: Two space separated integers, M and N
// Next M lines: N space separated integers, grid[][]

// Output Format:
// --------------
// Print an integer result.


// Sample Input-1:
// ---------------
// 3 5
// 0 1 1 1 1 
// 1 0 1 1 1 
// 0 0 0 0 1 

// Sample Output-1:
// ----------------
// 78

// Explanation:
// ------------
// Given grid is 
// 0 1 1 1 1
// 1 0 1 1 1
// 0 0 0 0 1

// Perform operation on row-0 and row-2
// 1 0 0 0 0
// 1 0 1 1 1
// 1 1 1 1 0

// Perform operation on col-1 and col-4
// 1 1 0 0 1 = 25
// 1 1 1 1 0 = 30
// 1 0 1 1 1 = 23
// So, now the total value of Binary Equivalent is 78


// Sample Input-2:
// ---------------
// 2 3
// 0 1 0
// 0 0 1

// Sample Output-2:
// ----------------
// 11

import java.util.*;

public class Bulbs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<m;i++){
            if(matrix[i][0] == 0){
                for(int j = 0;j<n;j++){
                    matrix[i][j] = 1 - matrix[i][j];
                }
            }
        }
        for(int i = 0;i<n;i++){
            int count1 = 0;
            int count0 = 0;
            for(int j = 0;j<m;j++){
                if(matrix[j][i] == 1){
                    count1++;
                }
                else{
                    count0++;
                }
            }
            if(count0>count1){
                for(int j = 0;j<m;j++){
                    matrix[j][i] = 1 - matrix[j][i];
                }
            }
        }
        
        int sum = 0;
        for(int i = 0;i<m;i++){
            StringBuilder temp = new StringBuilder();
            for(int j = 0;j<n;j++){
                temp.append(matrix[i][j]);
            }
            int binary = Integer.parseInt(temp.toString(),2);
            sum += binary;
        }
        System.out.println(sum);
        sc.close();
    }
}