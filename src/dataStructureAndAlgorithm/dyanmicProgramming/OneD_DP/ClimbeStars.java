package dataStructureAndAlgorithm.dyanmicProgramming.OneD_DP;

import java.util.Scanner;

public class ClimbeStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = climbStairs(n);
        System.out.println(count);
    }
    public static int climbStairs(int n) {
        if(n < 0) return 0;
        if(n == 0) return 1;
        return climbStairs(n-1) + climbStairs(n-2);
    }
    public static int climbStairsMemo(int n , int[] dp){
        if(n < 0)return 0;
        if(n == 0)return 1;

        if(dp[n] != -1)return dp[n];

        return dp[n] = climbStairsMemo(n-1 , dp) + climbStairsMemo(n-2 , dp);
    }
    // O(N) time complexity and space Complexity is  O(N) for dp array and O(N) for recursion so total time complexity
    // O(2N)
}
