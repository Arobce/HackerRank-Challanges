//https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] scores = new int[n];
        
        for (int i = 0; i < scores.length; i++) {
            
            scores[i] = sc.nextInt();
            
        }
        
        int max = scores[0];
        int min = scores[0];
        int maxCount = 0;
        int minCount = 0;
        
        for(int i=1 ; i<scores.length;i++){
                
            if(max<scores[i]){
                
                maxCount++;
                max = scores[i];
            }else if(min>scores[i]){
                
                minCount++;
                min = scores[i];
            }
        }
        
        System.out.print(maxCount + " "+ minCount);
            
        
    }
}
