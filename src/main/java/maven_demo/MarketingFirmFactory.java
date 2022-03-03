package maven_demo;

public class MarketingFirmFactory {
	
	public MarketingFirm createFirm(String managerType){
		if(managerType.equals("Stack")) {
			SweepstakesStackManager stackManager = new SweepstakesStackManager();
			MarketingFirm stackFirm = new MarketingFirm(stackManager);
			return stackFirm;
		}
		else if(managerType.equals("Queue")){
			SweepstakesQueueManager queueManager = new SweepstakesQueueManager();		
			MarketingFirm queueFirm = new MarketingFirm(queueManager);
			return queueFirm;
		}
		return null;
	}

}

