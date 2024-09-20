import java.util.Scanner;



public class BankApplication{

	private static int maxAccounts=1000;

	private static int currentAccountCount=0;

	

	

	private static String name[]=new String[maxAccounts];

	private static String AadharNumber[]=new String[maxAccounts];

	private static String PanNumber[]=new String[maxAccounts];

	private static String AccountNo[]=new String[maxAccounts];

	private static float Amount[]=new float[maxAccounts];

	

	

	



	public static void main(String[] args) {

		int choice;

		char ch;

		System.out.println("Enter your choice (y/n)");

		Scanner scan=new Scanner(System.in);

		ch=scan.next().charAt(0);

		if(ch=='n') {

			System.out.println("THANK YOU");

		}

		while(ch!='n') {

			System.out.println("1.Account Creation 2.Credit Amount 3.Debit Amount 4.Balance Enquiry 5.Transfer Amount");

			

			System.out.println("Enter your choice");

			choice=scan.nextInt();

			switch(choice) {

				

				

			

				case 1:

					String cname;

					String aadhar;

					String pan;

					System.out.println("Enter your name.");

					cname=scan.next();

					name[currentAccountCount]=cname;

					

					System.out.println("Enter your aadhar.");

					aadhar=scan.next();

					AadharNumber[currentAccountCount]=aadhar;

					

					

					System.out.println("Enter your pan.");

					pan=scan.next();

					PanNumber[currentAccountCount]=pan;

					

					int no=1000+currentAccountCount;

					

					String acc_no = String.valueOf(no);

					AccountNo[currentAccountCount] = acc_no;

					

					System.out.printf("Your Account is Created.Your account number is: %s\n",acc_no);

					

					Amount[currentAccountCount]=1000;

					currentAccountCount+=1;

					break;

				case 2:

					

					System.out.println("Enter your account number");

					String account_num=scan.next();

					int acc_index=AccountIndex(account_num);

					

					

					System.out.println("Enter amount you want to credit.");

					float creditAmount=scan.nextInt();

					Amount[acc_index]+=creditAmount;

					

					System.out.printf("Your amount is credited.Your balance is %f\n",Amount[acc_index]);

					break;

				case 3:

					System.out.println("Enter your account number");

					String Account_num=scan.next();

					int Acc_index=AccountIndex(Account_num);

					

					System.out.println("Enter amount you want to debit.");

					float debitAmount=scan.nextInt();

					if(Amount[Acc_index]>debitAmount) {

						Amount[Acc_index]-=debitAmount;

						System.out.printf("Your amount is debited.Your balance is %f\n",Amount[Acc_index]);

						

							}

					else {

						System.out.println("Insufficient balance in your account");

					}

					break;

					

					

				case 4:

					System.out.println("Enter your account number");

					String Acc_num=scan.next();

					

					int Account_index=AccountIndex(Acc_num);

					System.out.printf("Your name is %s\n",name[Account_index]);

					System.out.printf("Your aadhar is %s\n",AadharNumber[Account_index]);

					System.out.printf("Your pan number  is %s \n",PanNumber[Account_index]);

					System.out.printf("Your current balance is %f\n",Amount[Account_index]);

					break;

					

					

					

				case 5:

					String from_Account;

					String to_Account;

					int fromAccountIndex = 0;

					int toAccountIndex=0;

					System.out.println("Enter your account number");

					from_Account=scan.next();

					System.out.println("Enter account number where you want to transfer");

					to_Account=scan.next();

					System.out.println("Enter amount.");

					float amount=scan.nextFloat();

					if(Amount[fromAccountIndex]>amount) {

						Amount[fromAccountIndex]-=amount;

						Amount[toAccountIndex]+=amount;

						System.out.printf("Amount is transferred.Your balance is %f\n",Amount[fromAccountIndex]);

						

					}

					break;

					

				

					

					

					

					

					

					

					

					

					

					

			}

		

		}

		



	}

	

	



	public static int AccountIndex(String acc_no) {

		return acc_no.indexOf(acc_no);

		

				

		

		

		

	}



}
