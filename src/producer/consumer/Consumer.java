package producer.consumer;

public class Consumer implements Runnable{
	
	private PublicResource publicResource ;
	public Consumer(PublicResource publicResource){
		this.publicResource = publicResource;
	}
	private void consum() throws InterruptedException{
		
		publicResource.get();
		
	}
	@Override
	public void run() {
		try {
			for(int i=0; i<1000 ; i++){
				consum();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
