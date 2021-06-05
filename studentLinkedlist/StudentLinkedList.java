package studentLinkedlist;

public class StudentLinkedList {

	StudentNode head;

	StudentLinkedList() {
		head = null;
	}

	public void insertAtEnd(Student data) {    //O(n)

		StudentNode node = new StudentNode(data);
		if (head == null) {
			head = node;

			return;
		}

		StudentNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;

	}

	public void display() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		StudentNode temp = head;

		while (temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print(temp.data + " ");
		System.out.println("\n");

	}

	public void insertAtFront(Student  data) {  //O(1)

		StudentNode node = new StudentNode(data);
		if (head == null) {
			head = node;
			return;
		}

		node.next = head;
		head = node;

	}

	public void deleteAtFront() {       //O(1)
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		head = head.next;

	}

	/*
	 * public void deleteAtEnd() {
	 * 
	 * if(head==null) { System.out.println("List is Empty"); return; } Node
	 * temp=head; while(temp.next.next!=null) { temp=temp.next;
	 * 
	 * } temp.next=null; }
	 */
	public void deleteAtEnd() {    //O(n)                                   

		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		StudentNode temp = head; // 6000
		StudentNode it = temp.next; /// 1000
		while (it.next != null) {
			it = it.next; // 2000 3000 4000
			temp = temp.next; // 1000 2000 3000
		}

		temp.next = null;

	}

	/*
	 * public void insertAtPos(int data, int pos) {
	 * 
	 * int noOfNodes = getNoOfNodes();
	 * 
	 * if(pos==1) { insertAtFront( data); } else if(pos==noOfNodes+1) {
	 * insertAtEnd(data); } else if(pos > 1 && pos < noOfNodes+1) { Node temp =
	 * head; int x = pos-1; while(--x!=0) { temp =temp.next; } Node node =new
	 * Node(data); node.next = temp; temp.next=node; } }
	 */

	private int getNoOfNodes() {
		StudentNode temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public void insertAtIndex(Student  data, int index) {
		StudentNode node = new StudentNode(data);
		if (index == 0) {
			insertAtFront(data);
			return;
		}
		int count = getNoOfNodes();
		if (index > count) {
			System.out.println("count " + count);
			System.out.println("index " + index);
			System.out.println("invalid index");
			return;
		}
		StudentNode temp = head;
		int i = 1;
		while (i < index) {
			i++;
			temp = temp.next;
		}
		node.next = temp.next;
		temp.next = node;
	}

	public void deleteAtIndex(int index) {

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		if (index == 0) {
			deleteAtFront();
		}
		int count = getNoOfNodes();
		if (index > count) {
			System.out.println("count " + count);
			System.out.println("index " + index);
			System.out.println("invalid index");
			return;
		}
		StudentNode temp = head;
		StudentNode it = temp.next;
		int i = 1;
		while (i < index) {
			i++;
			it = it.next;
			temp = temp.next;
		}
		temp.next = it.next;
		it = null;

	}
	
	

	public void reversePrint(StudentNode temp) {
		
		if(temp!=null && temp.next!=null)
		{
			reversePrint(temp.next);
			
		}
		if(temp!=null)
		System.out.print(temp.data+" ");
		if(temp==head)
		{
			System.out.println();
		}
		

	}
	

	public void reverse() {
		StudentNode itn = head;
		StudentNode it = head;
		StudentNode itp = null;
		while(it!=null)
		{
			itn = it.next;
			it.next = itp;
			itp = it;
			it = itn;
		}
		head = itp;
		
	}

}
