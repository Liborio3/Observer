package observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ObserverPatternDemo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Subject subject = new Subject();
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);
		
//		System.out.println("Give me a number and i will transform it to Hex,Octal and Binary form ");
//		int choise = Integer.parseInt(reader.readLine());
//		subject.setState(choise);
		
		
		
		System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
	
		
	}

}
