//https://www.hackerrank.com/challenges/staircase/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         int a = 1;
       int n = 0;
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       for(int i=n-1;i>=0;i--)
       {
           for(int j=0;j<i;j++)
           {
               System.out.print(" ");
           }
           for(int k=0;k<a;k++)
           {
               System.out.print("#");
           }
           System.out.println();
           a++;
       }
   }
}