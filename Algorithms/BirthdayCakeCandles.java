//https://www.hackerrank.com/challenges/birthday-cake-candles/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n,  count = 0;
       int greatest = 0;
       n = sc.nextInt();
       int[] arr = new int[n];
       
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            if(arr[i]>greatest){
                greatest = arr[i];
            }
        }
        
        for(int i=0; i<n; i++ )
        {
            if(arr[i]==greatest){
                count++;
            }
        }
        
        System.out.println(count);
  
    }
}
