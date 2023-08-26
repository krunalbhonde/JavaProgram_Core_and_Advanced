package Advance_Collection;
import java.util.Queue;
import java.util.ArrayDeque;
public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new ArrayDeque();
		q.add(1);
		q.add(31);
		q.add(10);
		q.add(16);
		System.out.println(q);
		q.poll();
		System.out.println(q);
		
		System.out.println(q.peek());
		

	}

}
