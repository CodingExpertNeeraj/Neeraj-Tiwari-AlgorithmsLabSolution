/**
 * 
 */
package com.GreatLearning.Assignments.Algo1;

import java.util.Scanner;

/**
 * @author Neeraj Tiwari
 *
 */
public class TargetCheck {

	private int howManyTargets, targetValue;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TranscationsDetails myTranscations = new TranscationsDetails();
		TargetCheck myTargetCheck =  new TargetCheck();
		myTranscations.getInputs();
		myTargetCheck.checkOnTarget(myTranscations.transcations);
		
	}
	
	public void checkOnTarget(int[] targetValues)
	{
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total no of targets that needs to be achieved ");
        howManyTargets = sc.nextInt();
        
        
        for(int i=0;i<howManyTargets;i++)
        {
        	System.out.println("Enter the value of target ");
            targetValue = sc.nextInt();	
            
            int sum=0;
            for(int j=0;j<targetValues.length;j++)
            {
            	sum+=targetValues[j];
            	if(sum>=targetValue)
            	{
            		System.out.println("Target achieved after "+ (j+1) +" transactions ");
            		break;
            	}
            }
        }
	}

}
