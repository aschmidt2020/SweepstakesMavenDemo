package maven_demo;

import java.io.Console;

public class MarketingFirm {
	public SweepstakesManager manager;
	
	public MarketingFirm(SweepstakesManager manager) {
		this.manager = manager;
	}

	public void AddSweepstakes(String name) {
		Sweepstakes newSweepstakes = new Sweepstakes(name);
		manager.InsertSweepstakes(newSweepstakes);
	}
	
	public void RunSweepstakes() {
		Sweepstakes nextSweepstakes = manager.GetSweepstakes();
		Contestant winnerContestant = nextSweepstakes.ContestantPickWinner();
		System.out.println("Winner is: " + winnerContestant.firstName + " " + winnerContestant.lastName + " " + winnerContestant.email);
	}
}
