package tarotfortune;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class TarotApplication {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan=new Scanner(System.in);
		Carddeck carddeck=new Carddeck();
		Destiny destiny=new Destiny();
		File file=new File("C:\\Users\\90544\\eclipse-workspace\\tarotfortune\\src\\Cardinfo");
		Scanner sc=new Scanner(file);

		while (sc.hasNext()) {
			String strLine =sc.nextLine();
			TarotCard card=new TarotCard();

			String a0=strLine.split("@")[0];
			String a1=strLine.split("@")[1];
			String a2=strLine.split("@")[2];


			card.setCard_number(Integer.parseInt(a0));
			card.setCard_name(a1);
			card.setCard_meaning(a2);

			carddeck.insert(card);	
		}
		
		System.out.println("Welcome Tarot fortune-telling app");
		System.out.println("Please enter your name:");
		String customer_name=scan.nextLine();
		System.out.println("Please enter your age:");
		int customer_age=scan.nextInt();
		scan.nextLine();
		System.out.println("Please enter your gender (Female, Male)");
		String customer_gender=scan.nextLine();
		Customer customer=new Customer(customer_name, customer_age, customer_gender);
		System.out.println("Your registiration is completed we gave you a gem as a gift <3");
		
		while (true) {
			System.out.println("----------------------------------MAIN MENU--------------------------------------");
			System.out.println("Enter 1 to go to user menu...");
			System.out.println("Enter 2 to see your fortune.. every fortune require one gem, if you don't have a gem, buy it.");
			System.out.println("Enter 0 to close application");
			int temp = scan.nextInt();
			if(temp==1) {
				System.out.println("----------------------------------------User MENU--------------------------------------------");
			while(true) {
				System.out.println("Enter 1 to add money to the application...");
				System.out.println("Enter 2 to withdraw money");
				System.out.println("Enter 3 to see balance");
				System.out.println("Enter 4 to buy gems");
				System.out.println("Enter 0 to exit user menu");
				int usertemp=scan.nextInt();
				if(usertemp==1) {
					System.out.println("Enter the amount you want to load:");
					int money=scan.nextInt();
					customer.addmoney(money);
				}
				else if(usertemp==2) {
					System.out.println("Enter the amount you want to withdraw:");
					int money=scan.nextInt();
					customer.withdrawmoney(money);
							
				}else if(usertemp==3) {
					System.out.println("your current balance: "+customer.getBudget());
					System.out.println("your current number of gems: "+customer.getGem());
					
							
				}else if(usertemp==4) {
					System.out.println("How much money do you want to buy a gem, a gem is 5 TL");
					int money=scan.nextInt();
					customer.buygem(money);
							
				}else if(usertemp==0) {
					System.out.println("------------------------------exiting the user menu-------------------------------------");
				break;
							
				}else {
					System.out.println("Make proper typing...");
			
							
				}
			}}else if(temp==2) {
				
				if(customer.getGem()>0) {
				System.out.println("------------------------------------TAROT FORTUNE------------------------------------------");

					System.out.println("Now we will choose 3 different cards and tell your fortune.");
					boolean equality=true;
					int [] selectedcards =new int[3];
					for(int i=0;i<3;i++) 
					{
						System.out.println("Choose a number between 1 and 156");
						int numberOfCard =scan.nextInt();
						for (int j = 0; j < args.length; j++) {
							if(numberOfCard==selectedcards[j]) {
								
								equality= false;
							}
							
						}
					if(equality){
						destiny.push(carddeck.search(numberOfCard));
						selectedcards[i]=numberOfCard;
						}else {
							System.out.println("Enter another number...");
							i--;
						}
						
						
						
					}
					System.out.println("Your fortune is read by mystical forces");
					destiny.showdestiny();
					destiny.initializeStack();
					customer.setGem(customer.getGem()-1);

			}else {
				System.out.println("Please buy some gem......");
			}
		
	
			}else if(temp==0) {
				System.out.println("-----------------------------------Exiting application....Bye Bye-------------------------------------------");
				break;
				
			}else {
				System.out.println("Make proper typing...");
				
			}
		
		}
	}
}
	
