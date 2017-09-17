//https://www.hackerrank.com/challenges/diagonal-difference/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int[][] arr = new int[100][100];
        //size of matrix
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        
        //take input matrix
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        Solution sln = new Solution();
        int primaryDiagonal = sln.Diagonal(0, N, arr);
        // System.out.println(primaryDiagonal);
        int secondaryDiagonal = sln.Diagonal(N, N, arr);
        int sum = primaryDiagonal - secondaryDiagonal;
        
        sum = Math.abs(sum);
        System.out.println(sum);
        
   }
    
    
int Diagonal(int lim,int N,int mat[][]){
        int sumDiagonal = 0;
        if(lim==0){
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(i==lim && j==lim){
                        sumDiagonal += mat[i][j];
                        lim++;
                    }
                }
            }
        }else if(lim == N){
            int l = lim - 1;
            for(int i=0;i<N;i++){
                    for(int j=0;j<N;j++){
                        if(j==l){
                            sumDiagonal += mat[i][j];
                            l--;
                        }
                    }
                }
            }
        
        return sumDiagonal;
        
    }
}