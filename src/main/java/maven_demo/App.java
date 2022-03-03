package maven_demo;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		MarketingFirmFactory firmFactory = new MarketingFirmFactory();
		
		System.out.println("How would you like to manage your sweepstakes? 'Stack' (last in first out) or 'Queue' (first in first out)?");
		String responseString = scanner.nextLine();
		MarketingFirm chosenManagerFirm = firmFactory.createFirm(responseString);
		
		boolean exit = false;
		while(exit == false) {
			System.out.println("Would you like to do: 0- Add a new sweepstakes or 1- Run a sweepstakes or 2- Exit?");
			String response = scanner.nextLine();
			switch(response) {
				case "0":
					System.out.println("What is the name of the new sweepstakes?");
					String responseNameString = scanner.nextLine();
					chosenManagerFirm.AddSweepstakes(responseNameString);
					break;
				case "1":
					try {
						chosenManagerFirm.RunSweepstakes();
					} catch (Exception e) {
						System.out.println("No sweepstakes left to run.");
					}
					break;
				case "2":
					exit = true;
					break;
		};
		}
		
		
		
	}

}
