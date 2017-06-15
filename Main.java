package Wendler531;

import java.util.Scanner;
import java.util.TreeMap;
import java.lang.NumberFormatException;

/** Main method for executing Wendler531
 *  program, used to calculate working sets
 *  for overhead press, bench, squat, and deadlift
 *  based on user inputted 1 rep maxes.
 *  @author K. Chang
 */
class Main {

    public static void main(String... args) {
        boolean metric = false;
        Scanner sc = new Scanner(System.in);
        String[] lifts = new String[] 
            {"Overhead Press", "Squat", "Bench Press", "Deadlift"};
        TreeMap<String, Integer> myMap = new TreeMap<String,Integer>();
        for (String lift : lifts) {
            while (true) {
                try {
                    System.out.println(lift + " one rep max: ");
                    int max = Integer.parseInt(sc.next());
                    myMap.put(lift, max);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Not a valid number.");
                }
            }
        }
        Program p = new Program(myMap, metric);
        p.printProgram();
        System.exit(0);
    }
}
