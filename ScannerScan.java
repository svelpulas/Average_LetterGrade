/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerscan;
import java.util.Scanner;
/**
 *
 * @author sande
 */
public class ScannerScan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               Scanner scan = new Scanner(System.in);
        System.out.println("Enter test score #1: Enter test score #2: Enter test score #3: Choose one of the following options:\na: display the average\nb: display the letter grade");
        float Fscore = scan.nextFloat();
        float Sscore = scan.nextFloat();
        float Tscore = scan.nextFloat();
        float total = Fscore + Sscore + Tscore;
        float avg = total / 3 ;
        scan.nextLine();
        char option = scan.nextLine().charAt(0);
        if (option == 'a')
            System.out.println("Average score: " + avg);
        else
            if (avg >= 90 && avg <= 100)
                System.out.println("Letter grade: A");
            else if (avg >= 80 && avg < 90)
                System.out.println("Letter grade: B");
            else if (avg >= 70 && avg < 80)
                System.out.println("Letter grade: C");
            else if (avg >= 60 && avg < 70)
                System.out.println("Letter grade: D");
            else if (avg < 60)
                System.out.println("Letter grade: F");
    }
}

    

