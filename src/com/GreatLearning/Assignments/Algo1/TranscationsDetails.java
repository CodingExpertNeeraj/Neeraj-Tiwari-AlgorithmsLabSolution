/**
 * 
 */
package com.GreatLearning.Assignments.Algo1;

import java.util.Scanner;

/**
 * @author Neeraj Tiwari
 *
 */
public class TranscationsDetails {
	int size;
    int transcations[];

    public void getInputs()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of transaction array ");
        size = sc.nextInt();
        
        transcations = new int[size];
        System.out.println("Enter the values of array ");
              
        for(int i=0;i< transcations.length;i++)
        	transcations[i] = sc.nextInt(); 
    }
   
}
