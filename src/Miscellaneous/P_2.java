package Miscellaneous;/*
 * Created by Vaishnavi Chaurasia
 * 28-Jul-21
 * 6:57 AM
 * DataStructure-Problems
 */

import java.util.Scanner;

// First Hop - 20cm , Second Hop - 10cm , Third Hop - 5cm
// Calculate total distance travelled for the number of hops provuded as input
//
public class P_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Hops");
        int numberOfHops = sc.nextInt();
        int hops[] = {20 , 10 , 5};

        int distance = 0;

        int curr_hop= 0;
        int count = 0;

        while (count != numberOfHops){
            distance += hops[curr_hop];
            curr_hop++;
            count++;
            if(count % hops.length == 0)
                curr_hop = 0;
        }

        System.out.println(distance);
    }
}
