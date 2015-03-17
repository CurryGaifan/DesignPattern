package producer.consumer;

public class Test {
	public static void main(String[] args){
		PublicResource publicResource = new ListPublicResource();
//		PublicResource publicResource = new BlockQueuePublicResource();

		new Thread(new Producer(publicResource)).start();
		new Thread(new Producer(publicResource)).start();
		new Thread(new Producer(publicResource)).start();
		new Thread(new Producer(publicResource)).start();
		new Thread(new Producer(publicResource)).start();

		new Thread(new Consumer(publicResource)).start();
		new Thread(new Consumer(publicResource)).start();
		new Thread(new Consumer(publicResource)).start();
		new Thread(new Consumer(publicResource)).start();
		new Thread(new Consumer(publicResource)).start();

	}

}
