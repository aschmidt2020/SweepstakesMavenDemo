package maven_demo;
import java.util.Stack;

public class SweepstakesStackManager implements SweepstakesManager{
	public Stack<Sweepstakes> stack;
	
	public SweepstakesStackManager() {
		stack = new Stack<Sweepstakes>();
	}
	
	@Override
	public void InsertSweepstakes(Sweepstakes sweepstakes) {
		stack.push(sweepstakes);
		System.out.println(stack);
	}

	@Override
	public Sweepstakes GetSweepstakes() {
		Sweepstakes chosenSweepstakes = stack.pop();
		System.out.println("Running Sweepstakes: " + chosenSweepstakes.name);
		return chosenSweepstakes;
	}
	
}
