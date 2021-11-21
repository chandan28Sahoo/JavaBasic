package practiceJava;
import java.util.*;
public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*create random number*/
		int randomNumber =  (int) (Math.random()*100);

		Scanner sc = new Scanner(System.in);
		int userNumber = 0;
		/*check the guess number*/
		while(userNumber >= 0) {
			/*take input from user*/
			System.out.println("guess the number (1-100) :");
			userNumber = sc.nextInt();
			
			if(userNumber == randomNumber) {
				System.out.println("congrasulition....!!! you guess the number ");
				break;
			}
			
			else if(userNumber > randomNumber) {
				System.out.println("your number is learger ");
			}
			
			else {
				System.out.println("your number is smaller ");
			}
		}
		
		System.out.println("My Number was : ");
		System.out.println(randomNumber);
		
	}

}
