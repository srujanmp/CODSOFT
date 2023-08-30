import java.util.Scanner;

class ATMinterface{
	int balance=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		ATMinterface account=new ATMinterface(0);
		int choice=-1; 
		
		while(choice!=0) {
			
			System.out.println("***Banking Portal***\n");
			account.checkBalance(); 
			System.out.print("\nWithdraw     (1)\nDeposit      (2)\nCheck Balance(3)\nQuit Portal  (0)\n==> ");
			choice=sc.nextInt();
			
			
			if(choice==1) {
				System.out.print("Enter amount to withdraw => ");
				account.withdraw(sc.nextInt());
			}
			
			else if(choice==2) {
				System.out.print("Enter amount to deposit => ");
				account.deposit(sc.nextInt());
			}
			
			else if(choice==3) {
				account.checkBalance();
			}
			else {
				break;
			}
			
		}
		
	}
	
	ATMinterface(int balance){
		this.balance=balance;
	}
	
	void withdraw(int amount) {
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println("Withdrawed ₹"+amount+"\n");
		}
		else
			System.out.println("!!Insufficient Balance!!\n");
		
	}
	

	void deposit(int amount) {
		balance=balance+amount;
		System.out.println("Deposited ₹"+amount+"\n");
	}
	
	void checkBalance() {
		System.out.println("Balance = ₹"+balance);
	}
}