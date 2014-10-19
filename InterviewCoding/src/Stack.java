import java.util.*;

//The stack is implemented using the linked list Node class

public class Stack {
	
	Node top;
	
	public static void main(String[] args){
		
		Stack stck = new Stack();
		stck.push(1);
		stck.push(2);
		stck.push(3);
		
		stck.pop();
		
		System.out.println("The top elment of the stack - " + stck.top.data);	
	}
	
	
		
	public Node pop(){
		Node tmp = new Node();
		
		if(top !=null){
			tmp = top;
			top = top.next;
		}
		return tmp;
	}
	
	public void push(int elm){
		Node tmp = new Node();
		tmp.data = elm;
		tmp.next = top;
		top = tmp;
	}

}
