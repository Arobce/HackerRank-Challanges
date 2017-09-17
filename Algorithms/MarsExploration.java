//https://www.hackerrank.com/challenges/mars-exploration/submissions/code/51892695

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        String sos;
        Scanner sc = new Scanner(System.in);
        
        sos = sc.nextLine();
        
        int length = sos.length();
        int noOfSos = length / 3;
        int a = 0,count = 0;   
        
        
        for(int i=0;i<noOfSos;i++){
            if((sos.charAt(a))!='S'){
                count++;
            }
            if((sos.charAt(a+1))!='O'){
                count++;
            }
            if((sos.charAt(a+2))!='S'){
                count++;
            }
            a=a+3;
        }
        System.out.println(count);
    }
}
