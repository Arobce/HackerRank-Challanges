//https://www.hackerrank.com/challenges/apple-and-orange/problem

import java.util.Scanner;

public class Main {

    public final static Scanner sc = new Scanner(System.in);

    static int startingPointOfSamsHouse = 0;
    static int endingPointOfSamsHouse = 0;

    static int appleTreeLocation = 0;
    static int orangeTreeLocation = 0;

    static int noOfApples = 0;
    static int noOfOranges = 0;

    static int[] distancesOfApples;
    static int[] distancesOfOranges;


    public static void main(String[] args) {

        assignValues();
        System.out.println(getNoOfApplesLandingOnHouse());
        System.out.println(getNoOfOrangesLandingOnHouse());
    }

    public static void assignValues(){

        //The first line contains two space-separated integers denoting the respective values of s and t.
        //The second line contains two space-separated integers denoting the respective values of a and b.
        //The third line contains two space-separated integers denoting the respective values of m and n.
        //The fourth line contains m space-separated integers denoting the respective distances that each apple falls from point a.
        //The fifth line contains n space-separated integers denoting the respective distances that each orange falls from point b.

        String[] firstLine = sc.nextLine().split(" ");

        startingPointOfSamsHouse = Integer.parseInt(firstLine[0]);
        endingPointOfSamsHouse = Integer.parseInt(firstLine[1]);

        String[] secondLine = sc.nextLine().split(" ");

        appleTreeLocation = Integer.parseInt(secondLine[0]);
        orangeTreeLocation = Integer.parseInt(secondLine[1]);

        String[] thirdLine = sc.nextLine().split(" ");

        noOfApples = Integer.parseInt(thirdLine[0]);
        noOfOranges = Integer.parseInt(thirdLine[1]);

        String[] applesDistance = sc.nextLine().split(" ");

        distancesOfApples = new int[noOfApples];
        distancesOfOranges = new int[noOfOranges];

        for(int i=0;i<noOfApples;i++){
            distancesOfApples[i] = Integer.parseInt(applesDistance[i]);
        }

        String[] orangesDistance = sc.nextLine().split(" ");

        for(int i=0;i<noOfOranges;i++){
            distancesOfOranges[i] = Integer.parseInt(orangesDistance[i]);
        }

    }

    public static int  getNoOfOrangesLandingOnHouse(){
        int count = 0;
        int[] distanceArray = getRelativeDistanceOrangesFall();

        for(int i=0;i < distanceArray.length;i++)
        {
            if(checkIfOrangeLandsOnHouse(distanceArray[i])){
                count++;
            }
        }

        return count;

    }

    public static int getNoOfApplesLandingOnHouse(){
        int count = 0;
        int[] distanceArray = getRelativeDistanceApplesFall();

        for(int i=0;i < distanceArray.length;i++)
        {
            if(checkIfAppleLandsOnHouse(distanceArray[i])){
                count++;
            }
        }

        return count;
    }

    public static int[] getRelativeDistanceApplesFall(){
        int[] distanceArray = new int[noOfApples];

        for(int i=0;i<noOfApples;i++){
            distanceArray[i] = appleTreeLocation + distancesOfApples[i];
        }

        return distanceArray;
    }

    public static int[] getRelativeDistanceOrangesFall(){

        int[] distanceArray = new int[noOfOranges];
        for(int i=0;i<noOfOranges;i++){
            distanceArray[i] = orangeTreeLocation + distancesOfOranges[i];
        }
        return distanceArray;

    }

    public static boolean checkIfAppleLandsOnHouse(int distance){
        return distance >= startingPointOfSamsHouse && distance <= endingPointOfSamsHouse;
    }

    public static boolean checkIfOrangeLandsOnHouse(int distance){
        return distance >= startingPointOfSamsHouse && distance <= endingPointOfSamsHouse;
    }
    

}
