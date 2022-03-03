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
	}

	@Override
	public Sweepstakes GetSweepstakes() {
		Sweepstakes chosenSweepstakes = stack.pop();
		return chosenSweepstakes;
	}
	
}
