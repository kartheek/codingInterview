import java.util.*;

//Creating linked list node 

public class Node {

	int data;
	Node next = null;
	
	public Node(int d){ data = d;}
	public Node(){};
	
	
	public static void main(String[]  args){
		
		Node linkedList = new Node(1);
		linkedList.appendToTail(2);
		linkedList.appendToTail(3);
		linkedList.appendToTail(4);
		
		Node linkedList1 = new Node(1);
		linkedList1.appendToTail(2);
		linkedList1.appendToTail(3);
		//linkedList1.appendToTail(4);
		
		Node elNode = linkedList.nthLastElement(4);
		
		System.out.println("The linked list object - " + elNode.data);
		
		deleteNode(linkedList.next.next);
		System.out.println(" After deletion - " + linkedList.next.data);
		
		elNode = addLists(linkedList1, linkedList, 0);
		System.out.println("Added node data - " + elNode.next.data);
		
	}
	
	//Adding a element to node
	public void appendToTail(int d){
		Node end = new Node(d);
		
		Node n = this;
		while ( n.next != null ){
			n = n.next;
		}
		n.next = end;
		
	}

	//Deleting a element
	public Node deleteNode(Node head, int d){
		Node n = head;
		if( n.data == d ){ return head.next;}
		
		while(n.next != null){
			if(n.next.data == d){ n.next = n.next.next; }
			else{ n = n.next;}
		}
		
		return head;
		
	}
	
	//finding nth last element
	public Node nthLastElement(int n){
		
		Node startPtr = this;
		Node endPtr = this;
		/*int count=0;
		
		while (count < n && endPtr.next != null){
			endPtr = endPtr.next;count++;
			
		}
		if(count < n){ return null;}*/
		
		for(int j=0; j<n-1; j++){
			if(endPtr == null){ return null;}
			endPtr = endPtr.next;
		}
		
		while( endPtr.next != null ){ startPtr = startPtr.next; endPtr = endPtr.next;}
		return startPtr;
						
	}
	
	//deletes only the middle of the linked list
	public static void deleteNode(Node ptr){
		
		if(ptr == null ) return;
		
		ptr.data = ptr.next.data;
		ptr.next = ptr.next.next;
		
	}
	
	// Adding two linked lists
	
	public static Node addLists(Node l1, Node l2, int carry){
		
		if(l1 == null && l2 == null) return null;
		
		Node result = new Node();
		if(l1 != null ) result.data += l1.data;
		if(l2 != null) result.data +=l2.data;
		result.data += carry;
		if(result.data > 10 ) carry =1;
		result.data = result.data % 10;
		
		result.next = addLists( l1 == null ? null:l1.next,  
							    l2 == null ? null:l2.next,
								carry		
						      );
		return result;
	}
	
	
	
}
