import javax.swing.JOptionPane;

/*
 * Tracy Quintos
 * 3/11/15
 * 18C 42030
 * Assignment # 2
 */

public class Search {

	private int[] array;
	private int matchCount = 0;
	
	long startTime;
	long endTime;
	long duration;
	
	
	public Search() {
		// TODO Auto-generated constructor stub
	}
	
	public Search(int[] array){
		this.array = array;
	}
	
	// linear
	public void linear(int toFind){
		startTime 	= System.currentTimeMillis();
		for (int i = 0; i < array.length; i++) {
			if (toFind == array[i]) {
				System.out.println("The number " + toFind + " is found on index " + i);
				matchCount++;
			}
		}
		if(matchCount > 0){
			endTime 	= System.currentTimeMillis();
			duration = (endTime - startTime);
			System.out.println(matchCount + " MATCHES FOUND! (" + duration + "ms).");
		}
		else {
			endTime 	= System.currentTimeMillis();
			duration = (endTime - startTime);
			System.out.println("NO MATCH FOUND!(" + duration + "ms).");
		}
	}
	
	// binary
	public void binary(int toFind){
		
		int first, middle, last;
		startTime = System.currentTimeMillis();
		first = 0;
		last = array.length-1;
		middle = (first + last)/2;
		
		while(last >= first && array[middle] != toFind) {
			if (array[middle] < toFind) {
				first = middle + 1;
			}
			else {
				last = middle - 1;
			}
			middle = (first + last)/2;
		}
		if (first > last) {
			JOptionPane.showMessageDialog(null, "NOT FOUND!");
		}
		else {
			JOptionPane.showMessageDialog(null, "FOUND!");
		}
	}
	
	public void testDisplay(){
		System.out.println("TEST");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	//TODO get & set
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Search().testDisplay();
	}

}
