package maven_demo;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Sweepstakes {
	public String name;
	public HashMap<Integer, Contestant> contestants;
	
	public Sweepstakes(String name) {
		this.name = name;
		contestants = new HashMap<Integer, Contestant>();
		RegisterContestantsFromCSV();
	}
	
	public void RegisterContestantsFromCSV() {
		CSVParser csvParser = new CSVParser();
		List<Contestant> csvContestants = csvParser.parse();
		for (Contestant contestant : csvContestants) {
			contestants.put(contestant.id, contestant);
		}
//		Contestant valueString = contestants.get(1);
//		System.out.println(valueString.firstName + valueString.lastName);
	}
	
	public void RegisterContestants() {
//		System.out.println("TBD");
		int id = 0;
		if(contestants != null) {			
			id = contestants.size() + 2;
		}
		else {
			id = 1;
		}
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Contestant's first name:");
		String firstName = scanner.nextLine();
		
		System.out.println("Contestant's last name:");
		String lastName = scanner.nextLine();
		
		System.out.println("Contestant's email:");
		String email = scanner.nextLine();
		
		
		Contestant newContestant = new Contestant(id, firstName, lastName, email, false);
		contestants.put(id, newContestant);
		System.out.println("Contestant entered: " + newContestant.firstName + newContestant.lastName);
//		System.out.println(contestants);
	}
	
	public Contestant ContestantPickWinner() {
//		System.out.println("TBD");
		Random rand = new Random();
		int randomNumber = rand.nextInt(contestants.size());
		Contestant winnerContestant = contestants.get(randomNumber);
		winnerContestant.setWinner(true);
		return winnerContestant;
	}
}
