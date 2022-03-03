package maven_demo;

public class SweepstakesManagerFactory {
	
	public SweepstakesManager createManager(String managerType){
		if(managerType.equals("Stack")) {
			SweepstakesStackManager stackManager = new SweepstakesStackManager();
			return stackManager;
		}
		else if(managerType.equals("Queue")){
			SweepstakesQueueManager queueManager = new SweepstakesQueueManager();		
			return queueManager;
		}
		return null;
	}

}

