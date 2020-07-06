package Queue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class Que//information specific,duplicates allowed, null not alloewd
{
	public static void main(String[] args)
	{
		PriorityQueue qp = new PriorityQueue();
		qp.add(31);
		qp.add(12);
		qp.add(81);
		qp.add(56);
		qp.add(14);
		//qp.add(12);
		//qp.add();
		
		Iterator i = qp.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println();
		System.out.println(qp.peek());
		qp.poll();
		
		System.out.println();
		
		i = qp.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
