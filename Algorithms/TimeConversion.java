//https://www.hackerrank.com/challenges/time-conversion/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args) {
         //declare varibles 
       String st = "";
       
       //take input
       Scanner sc = new Scanner(System.in);
       st = sc.nextLine();
       
       //split string
       String[] time = st.split(":");
       int hour = Integer.parseInt(time[0]);
       int min = Integer.parseInt(time[1]);
       String meridiam = time[2].substring(time[2].length()-2, time[2].length()); 
       int sec = Integer.parseInt(time[2].substring(time[2].length()-4,time[2].length()-2));
       String hr = "";
       //check logic
       if(hour==12 && meridiam.equals("AM")){
           hr = "00"; 
       }
       else if(hour!=12 && meridiam.equals("PM")){
           hour = hour + 12;
           hr = String.valueOf(hour);
       }else{
            hr =String.valueOf(hour);
       }
        System.out.println((hour < 10 ? "0" : "") + hr +":" +(min < 10 ? "0" : "" ) + String.valueOf(min) +":"+ (sec < 10 ? "0" : "") + String.valueOf(sec));
      
    }
}
