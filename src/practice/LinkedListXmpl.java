package practice;

public class LinkedListXmpl {

	Node head;
	
	public LinkedListXmpl() {
		this.head = new Node(-1);
	}
	
	public void addFirst(int value) {
		Node tmp = head.next;
		head.next = new Node(value);
		head.next.next = tmp;
		tmp = null;
	}
	
	public int countNodes() {
		int nodes = 0;
		if (this.head != null) {
			for (Node n = this.head.next; n!=null; n = n.next) {
				nodes++;
			}
		}
		return (nodes);
	}
	
	public void print() {
		System.out.print("[");
		for(Node n = this.head.next; n!= null; n = n.next) {
			System.out.print(n.num + " ");
		}
		System.out.print("]");
	}
	
	class Node{
		public int num;
		public Node next;
		
		public Node(int num) {
			this.num = num;
			this.next = null;
		}
	}
	
}
