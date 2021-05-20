package tts.practicepackage;

public class PracticeForLoopLabeledContinue {
	
	
	
public static void main(String[] args) {
	
//labeled outer
outer:
	//will make 4 outer loops
	for (int i=0; i<5; i++) {
		System.out.println("List number: " + i);
				//will loop 25 times (0-24) each time
				
			for (int y=0; y<25; y++) {
				System.out.println("Index: "+ y);
				//this will break at index:12
				if(y==12) {
					//this will make next loop after 12
					continue outer;
				}
			}
	}


	
}

}
