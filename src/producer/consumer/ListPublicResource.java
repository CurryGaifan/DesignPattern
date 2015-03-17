package producer.consumer;

import java.util.LinkedList;
import java.util.List;

public class ListPublicResource implements PublicResource{
	private List<Object>  list = new LinkedList<Object>(); 
	private int size = 100;
	public boolean isFull(){
		return list.size()== size;
	}
	
	public boolean isEmpty(){
		return list.size()== 0;
	}
	
	public synchronized void add(Object obj){
		
		while(isFull()){
			System.out.println("resource is full");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		list.add(obj);
		System.out.println("product one " + list.size());
		notify();
		
		
	}
	
	public synchronized Object get(){
		while(isEmpty()){
			System.out.println("resource is empty");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Object  obj=list.remove(0);
		System.out.println("consum one " + list.size());
		notify();
		return obj;
		
		
	}
}
