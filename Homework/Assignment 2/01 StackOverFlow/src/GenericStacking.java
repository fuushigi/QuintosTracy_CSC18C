/*
 * Tracy Quintos
 * 3/11/15
 * 18C 42030
 * Assignment # 2 sample
 */

import java.util.Stack;

public class GenericStacking {
	
	public static void main(String[] args) {
		
		Character[] charArray = {'u','n','l','i','m','i','t','e',
				'b','d','l','a','d','e','w','o','r','k','s'};
		
		Stack<Character> tracyS = new Stack<Character>();
		System.out.println("Current Stack");
		for (int i = 0; i < charArray.length; i++) {
			tracyS.push(charArray[i]);
		}
		System.out.println(tracyS);
		
		//removing top of stack up to misspelling "unlimited blade works"
		for (int i = charArray.length; i > 8; i--) {
			tracyS.pop();
		}
		System.out.println(tracyS);
		
		//restacking
		tracyS.push(charArray[9]);
		tracyS.push(charArray[8]);
		
		//
		for (int i = 10; i < charArray.length; i++) {
			tracyS.push(charArray[i]);
			
		}
		tracyS.push(charArray[9]);
		tracyS.push(charArray[8]);
		tracyS.push(charArray[7]);

		System.out.println("Current Stack after restacking");
		System.out.println(tracyS); 
	}

}

//unlimitedbladeworks
