package producer.consumer;

public class Producer implements Runnable{
	
	private PublicResource publicResource;
	public Producer(PublicResource publicResource){
		this.publicResource = publicResource;
	}
	
	private void product() throws InterruptedException{
		
		publicResource.add(new Object());
		
	}
	@Override
	public void run() {
		try {
			for(int i=0; i<1000 ; i++){
				product();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
