/*
 * Tracy Quintos
 * 3/11/15
 * 18C 42030
 * Assignment # 2
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SortAndSearchTest {
	public static void main(String[] args) {
				
		int[] array = Sort.fillArray(2000); // any value for testing
		int userSelection;
		
		//String input = JOptionPane
		long startTime;
		long endTime;
		long duration;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Pick a number: ");
		userSelection = input.nextInt();
		
		input.close();
		startTime 	= System.currentTimeMillis();
		Sort.print(Sort.markSortWithAnalysis(array), 10);

		Search search = new Search(array);
		search.binary(userSelection);
		
		//Sort.displayLogs();
		//search.displayLogs();
		
		endTime 	= System.currentTimeMillis();
		duration = (endTime - startTime);
		JOptionPane.showMessageDialog(null, duration + " Milliseconds");
	}
}
