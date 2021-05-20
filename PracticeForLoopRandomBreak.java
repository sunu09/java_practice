package tts.practicepackage;

import java.util.Random;

public class PracticeForLoopRandomBreak {
	
	
	
public static void main(String[] args) {
	
	Random random = new Random();

	int breakAt = random.nextInt(100);
//labeled loop	
outer:
	//it will give 5 loops with random number
for (int x=1; x<=5; x++) {
	System.out.println("Starting list " + x);
	
	for (int i=0; i<100; i++) {
		if (i==breakAt) {
			System.out.println("Random number was: " + breakAt);
			//if you want to stop generating lists altogether
			if(breakAt%x == 2) {
				System.out.println("List generation enede early");
				//labeled break
				break outer;
				}
			else {
				break;
			}
		}
	
	System.out.println("Index: " + i);
}
	System.out.println("Finish list " + x);
	//this will help you to pick random number for next loop
	breakAt = random.nextInt(100);
}
System.out.println("After the loop");

}

}
