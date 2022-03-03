package maven_demo;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MarketingFirmFactory firmFactory = new MarketingFirmFactory();
		
		System.out.println("How would you like to manage your sweepstakes? 'Stack' (last in first out) or 'Queue' (first in first out)?");
		String responseString = scanner.nextLine();
		MarketingFirm chosenManagerFirm = firmFactory.createFirm(responseString);
		
		System.out.println("Would you like to do: 0- Add a new sweepstakes or 1- Run a sweepstakes?");
		int response = scanner.nextInt();
		switch(response) {
		case 0:
			System.out.println("What is the name of the new sweepstakes?");
			String responseNameString = scanner.nextLine();
			chosenManagerFirm.AddSweepstakes(responseNameString);
			break;
		case 1:
			chosenManagerFirm.RunSweepstakes();
			break;
	};
		
		
		
	}

}
