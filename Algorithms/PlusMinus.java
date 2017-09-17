//https://www.hackerrank.com/challenges/plus-minus/submissions/code/48522748

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            int N = 0;
        double num_pve = 0;
        double num_neg = 0;
        double num_zero = 0;
     
        Scanner sc = new Scanner(System.in);
        //N number of int
        N = sc.nextInt();
        //initiialize array
        int[] ar = new int[N];
        //enter array
        for(int i=0;i<N;i++)
        {
            ar[i] = sc.nextInt();
        }
        //check array
        for(int i=0;i<N;i++){
            if(ar[i]>0)
            {
                num_pve++;
            }
            else if(ar[i]<0){
                num_neg++;
            }
            else{
                num_zero++;
            }  
        }
        //compute fractions
        System.out.printf("%.6f %n",num_pve/N);
        System.out.printf("%.6f %n",num_neg/N );
        System.out.printf("%.6f %n",num_zero/N) ;
        
        
    }
}