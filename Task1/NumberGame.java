import java.util.Scanner;
import java.util.Random;
public class NumberGame {
	public static void main(String[] args) {
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		
		int attempt=0;
		int randno=0;
		int guessno=0;
		int wins=0;
		int lose=0;
		int a=1;
		int maxattempt=20;
		
		System.out.println("******STARTING NUMBER GAME******\n");
		while(a==1) {
			randno=r.nextInt(1,100);
			guessno=-1;
			attempt=0;
			while(guessno !=randno) {
				System.out.print("Enter your guess for the generated number: ");
				guessno=sc.nextInt();
				attempt++;
				
				if(guessno==randno) {
					System.out.println("\nCongratulations, your Guess is correct");
					wins++;
				}
				else if(guessno<randno) {
					System.out.println("Too Low");
				}
				else if(guessno>randno) {
					System.out.println("Too High");
				}
				if(attempt>=maxattempt) {
					System.out.println("Maximum attempts completed, You Lost ");
					lose++;
					break;
				}
			}
			System.out.println("Attempts taken: "+attempt);
			System.out.println("Total wins    : "+wins);
			System.out.println("Total loss    : "+lose);
			System.out.println("Score="+(wins/(lose+1))*100+"\n");
			System.out.println("Do you wish to play again(1=Yes,0=No): ");
			a=sc.nextInt();
			System.out.println("****************************************");
		}
		System.out.println("\nExited Game");
		
		
		
		
		
	}
	
}
