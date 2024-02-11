import java.util.Scanner;
class BankAccount{
	String accountholder;
	int balance;
	
		public void inputData(){
			Scanner s=new Scanner(System.in);
			System.out.println("Enter accountholder name :");
			accountholder=s.nextLine();
			System.out.println("Enter balance:");
			balance= s.nextInt();
		}
		public void display(){
			System.out.println("acccountholder name :"+accountholder);
			System.out.println("balance in account:"+balance);
		}
		public void deposit(int amount){
			balance+=amount;

			System.out.println("deposited Rs."+balance);


		}
		public void withdraw(int amount){
			if (balance<=amount){
				balance=balance-amount;
				System.out.println("withdraw: Rs"+amount);
			}
			else{
				System.out.println("Insufficent Funds :|");
			}
		}
	}
class SavingAccount extends BankAccount{
	@Override
	public void withdraw(int amount){
	if(balance - amount >= 1000){
		balance -= amount;
		System.out.println("withdraw successful.");
	}
	else{
		System.out.println("Your account balance is lower than Rs 1000");
	}
}
}


class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		SavingAccount savingAccount =new SavingAccount();
		int choice;
		do{
			System.out.println("menu");
			System.out.println("-----------");
			System.out.println("1.inputData");
			System.out.println("2.display");
			System.out.println("3.deposit");
			System.out.println("4.withdraw");
			System.out.println("5.exit");
			choice = s.nextInt();
			switch(choice){
			  	case 1:
			  		savingAccount.inputData();
			  		break;
			  	case 2:
			  		savingAccount.display();
			  		break;
			  	case 3:
			  		System.out.println("Enter amount to deposite");
			  		int depositedamount=s.nextInt(); 
			  		savingAccount.deposit(depositedamount);
			  		break;
			  	case 4:
			  		System.out.println("Enter amount to withdraw");
			  		int depositedamounts=s.nextInt(); 
			  		savingAccount.deposit(depositedamounts);
    				break;
    			case 5:
    				System.out.println("exit");
    				break;
    			default:
    				System.out.println("invalid command");

			}



		}while(choice!=5);
	}
	class Interest1 {
    public void addInterest(SavingAccount savingAccount) {
        double interest = savingAccount.balance * 0.04;
        savingAccount.balance += interest;
        System.out.println("Interest of 4% added to Savings Account");
    }
}


class Main1 {
  public void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.inputData();
        savingAccount.deposit(1000);
        savingAccount.display();
        savingAccount.display();

 
    }

}
}



	