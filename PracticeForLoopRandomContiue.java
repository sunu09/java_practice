package tts.practicepackage;

import java.util.Random;

public class PracticeForLoopRandomContiue {
	
	
	
public static void main(String[] args) {
	
	Random random = new Random();

	int breakAt = random.nextInt(100);


	for (int i=0; i<100; i++) {
		
		if (i==breakAt) {
			System.out.println("Random number was: " + breakAt);
			//break;
			}
		//only odd numbers will be printed
			if(i%2 == 0) {
				//will continue loop
				continue;
		}
	
	System.out.println("Index: " + i);
}
	
}

}
