package producer.consumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockQueuePublicResource implements PublicResource{
	private BlockingQueue<Object>  q = new LinkedBlockingQueue<Object>(10);
//	private int size = 100;
	@Override
	public synchronized void add(Object obj) {
		try {
			q.put(obj);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("product " + q.size());
	}

	@Override
	public Object get() {
		
		Object obj = null;
		try {
			obj = q.take();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("consum " + q.size());
		return obj;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return q.isEmpty();
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return q.remainingCapacity()==0;
	}
	
	
}
