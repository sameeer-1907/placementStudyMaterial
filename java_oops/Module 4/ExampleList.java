import java.util.*;
import java.util.Deque;

public class ExampleList {

	public static void main(String[] args) {
		/*
		List<Integer> l=new LinkedList<>();
		l.add(333);
		l.add(47);
		l.add(32);
		l.add(47);
		l.add(578);
		Collections.sort(l);
		//System.out.println(l);
		
		
		//l.add(1,555);
		System.out.println(l);
		
		/*
		List<String> l1=new ArrayList<>();
		l1.add("Hritik");
		l1.add("Praise");
		l1.add("4");
		l1.add(2,"xyz");
		//System.out.println(l1);
		
		
		//l.remove(1);
		//l.remove(Integer.valueOf(578));
		System.out.println(l);
		
		List<Integer> newl=new ArrayList();
		newl.add(999);
		newl.add(888);
		l.addAll(newl);
		//System.out.println(l);
		
		System.out.println(l.contains(555));
		
		System.out.println(l.get(1));
		l.set(3,777);
		System.out.println(l);
		
		
		List<Object> s=new ArrayList();
		s.add(new Student3());
		s.add(new Teacher3());
		s.add(1000);
		s.add("Mahatma Gandhi");
		s.add(1, "Hi");
		
		//System.out.println(s);
		
		
		//for loop
		for(int i=0; i<l.size();i++)
		{
			System.out.println("current element"+l.get(i));
			
		}
		
		//for each loop
		
		for(Integer elt:l)
		{
			System.out.println("current element for each"+elt);
		}
		
		//iterator interface, iterator() method
		
		Iterator<Integer> itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println("current element iterator"+itr.next());
		}
		
		*/
		
		/*
		
		Stack<String> birds=new Stack();
		birds.push("dove"); //add
		birds.push("pigeon");
		birds.push("parrot");
		birds.push("peacock");
		
		System.out.println("birds "+birds);
		
		System.out.println("birds peek "+birds.peek());
		
		birds.pop(); //remove
		
		System.out.println("birds "+birds);
		*/
		/*
		Queue <Integer> q =new LinkedList();
		System.out.println("queue elt "+q.element());
		//q.remove();
		System.out.println(q.poll());
		q.offer(1);
		q.offer(11);
		q.offer(111);
		q.offer(1111);
		
		System.out.println("queue q "+q);
		
		
		System.out.println("queue peek "+q.peek());
		
		q.poll();
		
		System.out.println("queue q "+q);
		
		q.add(38);
		
		System.out.println("queue q "+q);
		q.remove(38);
		System.out.println("queue q "+q);

		System.out.println("queue elt "+q.element());
		
		*/
		/*
		Queue<Integer> pq=new PriorityQueue(Comparator.reverseOrder());
		pq.offer(1111);
		pq.offer(102);
		pq.offer(1);
		pq.offer(11);
		pq.offer(111);
		
		System.out.println("prio queue pq "+pq);
		System.out.println("prio queue pq "+pq.peek());
		
		pq.poll();
		
		System.out.println("prio queue pq "+pq);
		pq.poll();
		
		System.out.println("prio queue pq "+pq.peek());
		
		*/
		/*
		ArrayDeque<Integer> adq=new ArrayDeque();
		adq.offer(11);
		adq.offerFirst(12);
		adq.offerLast(13);
		adq.offer(20);
		System.out.println("dequeue adq "+adq);
		
		System.out.println("dequeue adq "+adq.peek());
		System.out.println("dequeue adq "+adq.peekFirst());
		System.out.println("dequeue adq "+adq.peekLast());
		
		adq.poll();
		System.out.println("dequeue adq "+adq);
		adq.pollFirst();
		System.out.println("dequeue adq "+adq);
		adq.pollLast();
		System.out.println("dequeue adq "+adq);
		*/
		/*
		Set<Integer> s=new HashSet();
		s.add(10); 
		s.add(3);
		s.add(28);
		s.add(22);
		s.add(43);
		s.add(44);
		s.add(44);
		
		System.out.println("s "+s);
		
		s.remove(22);
		
		System.out.println(s);
		System.out.println(s.contains(28));
		
		Set<Integer> s1=new LinkedHashSet();
		s1.add(10); 
		s1.add(3);
		s1.add(28);
		s1.add(22);
		s1.add(43);
		s1.add(44);
		s1.add(44);
		s1.remove(22);
		System.out.println("s1 "+s1);
		
		Set<Integer> s2=new TreeSet(Comparator.reverseOrder());
		s2.add(10); 
		s2.add(3);
		s2.add(28);
		s2.add(22);
		s2.add(43);
		s2.add(44);
		s2.add(44);
		s2.remove(22);
		System.out.println("s2 "+s2);
		
*/
	/*	
		Map<String,Integer> m=new TreeMap();
		m.put("Ram", 1);
		m.put("Abram", 2);
		m.put("Minnal", 3);
		m.put("Thor", 4);
		
		System.out.println(m);
		
		m.putIfAbsent("Thor", 7);
		
		System.out.println(m);
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.containsKey("Abram"));
		System.out.println(m.containsValue(38));
		//isEmpty, clear, remove
		
		for(String keys:m.keySet())
		{
			System.out.println(keys);
		}
		
		for(Integer vals:m.values())
		{
			System.out.println(vals);
		}
		
		for(Map.Entry<String,Integer> elt:m.entrySet())
		{
			//System.out.println(elt);
			//System.out.println(elt.getKey());
			System.out.println("inside entry "+elt.getValue());
			
		}
		
		*/
		
		Vector<Double> v=new Vector();
		v.add(29.6);
		v.add(31.5);
		System.out.println(v);
		
		
		
		
		
	
	}
	
	

}

class Teacher3{
	
	
	
}
class Student3{
	
	Student3()
	{
		
		System.out.println("hello from student");
	}
	
}
