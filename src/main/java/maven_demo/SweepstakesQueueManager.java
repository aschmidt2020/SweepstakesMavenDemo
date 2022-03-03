package maven_demo;
import java.util.LinkedList;
import java.util.Queue;

public class SweepstakesQueueManager implements SweepstakesManager{
	public Queue<Sweepstakes> queue;
	
	public SweepstakesQueueManager() {
		queue = new LinkedList<Sweepstakes>();
	}

	@Override
	public void InsertSweepstakes(Sweepstakes sweepstakes) {
		queue.add(sweepstakes);
		//System.out.println(queue);
	}
	
	@Override
	public Sweepstakes GetSweepstakes() {
		//to remove and return front value
		Sweepstakes next = queue.remove();
		System.out.println("Running Sweepstakes: " + next.name);
		
		//to return front value without deleting
		//Sweepstakes peek = queue.peek();
		
		return next;
	}
}
