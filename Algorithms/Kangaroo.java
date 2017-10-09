//https://www.hackerrank.com/challenges/kangaroo/problem


public class Solution {


    public static void main(String[] args) {
        int x1,v1,x2,v2;
        
        Scanner sc = new Scanner(System.in);
        
        x1 = sc.nextInt();
        v1 = sc.nextInt();
        x2 = sc.nextInt();
        v2 = sc.nextInt();
        
      if((x1<x2) && (v1<v2)){
        System.out.println("NO");
      }
      else
      {        
        if((v1!=v2) && ((x2-x1)%(v1-v2))==0)
            System.out.println("YES");
        else
            System.out.println("NO");

      }
    }
}
