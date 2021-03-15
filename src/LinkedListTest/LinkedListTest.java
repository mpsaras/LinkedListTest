package LinkedListTest;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		//Creating object of the
		//class linked list
		LinkedList<String> list = new LinkedList<String>();
		
		//Adding elements to the linked list, it appends the element to the end of the linked list
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		//Adding an element in index 2 of the LinkedList array, it shifts any element
		//currently at this position and any remaining elements to the right
		list.add(2,"E");
		
		System.out.println(list);
		
		//The size method returns the number of elements in the Linked List.
		System.out.println(list.size());
		
		//Removes the first occurrence of the specified element if the list, if the element exists,
		//the remove method in the LinkedList class returns true.
		list.remove("B");
		
		//Removes the first occurrence of the specified element if the list, if the element does 
		//not exist, it returns false
		list.remove(3);
		//Returns and removes the first element of the Linked List
		list.removeFirst();
		//Returns and removes the last element of the Linked List
		list.removeLast();
		
		System.out.println(list);
		
		//Replaces an element within a specified position in a Linked List with another specified
		//element
		list.set(0,"M");
		System.out.println(list);
		
		//The size method returns the number of elements in the Linked List.
				System.out.println(list.size());
				
		//The peek method retrieve, but does not remove, the head(first element) of this list.	
		String element=list.peek();
		System.out.println("The Linked List value retrieved from the peek method:" + element);
		
		//The size method returns the number of elements in the Linked List.
		System.out.println(list.size());
		
		//The poll method, retrieves and removes the head(first element) of this list
		String elementPoll = list.poll();
		System.out.println("The Linked list value retrieved from the poll method:" + elementPoll);
		
		//The size method returns the number of elements in the Linked List.
		System.out.println(list.size());
	}

}
