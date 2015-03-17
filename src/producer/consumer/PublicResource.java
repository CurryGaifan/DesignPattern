package producer.consumer;


public interface PublicResource {
	public boolean isFull();
	
	public boolean isEmpty();
	
	public void add(Object obj);
	
	public Object get();
}
