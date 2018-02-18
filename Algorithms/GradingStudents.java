//https://www.hackerrank.com/challenges/grading/problem


public class Solution {


    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        double[] initialArr = new double[num];
        double[] finalArr = new double[num];
        
        for (int i = 0; i < num; i++) {
            initialArr[i] = sc.nextInt();
            if(initialArr[i] < 38 ){
                finalArr[i]=initialArr[i];
            }else{
                double factor = Math.ceil(initialArr[i]/5);
                double multiple5 = factor * 5;
                double result = multiple5 - initialArr[i];
                
                if(result>=3){
                    finalArr[i]=initialArr[i];
                }else{
                    finalArr[i]=multiple5;
                }
            }
        }
        
        for (int i = 0; i < num; i++) {
            System.out.println((int) finalArr[i]);
        }
        
        
}
