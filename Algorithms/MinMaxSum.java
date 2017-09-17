//https://www.hackerrank.com/challenges/mini-max-sum/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        long[] num = new long[5];
        long[] buffer = new long[5];
        long[] sum = new long[5];
        Scanner sc = new Scanner(System.in);
        long greatest=0;
        //input
        for(int i=0;i<5;i++)
        {
            num[i] = sc.nextInt();
            buffer[i] = num[i];
        }
        //remove num
        for(int i=0;i<5;i++){
            num[i] = 0;
            for(int j=0;j<5;j++)
            {
                sum[i] += num[j];
                num[j] = buffer[j];
            }
//            num = buffer;
        }
        //find greatest and small
        for(int i=0;i<5;i++){
            if(sum[i] > greatest ){
                greatest = sum[i];
            }
        }
        long smallest = greatest;
        for(int i=0;i<5;i++){
            if(sum[i] < smallest ){
                smallest = sum[i];
            }
        }
        System.out.println(smallest+" "+greatest);
        
        
        
    }
}
