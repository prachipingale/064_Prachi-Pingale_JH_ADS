class LinkedList{
     Node head;
     Node temp;
     Node prev;
     Node cur;
	 class Node{
	   int data;
	   Node next;
	 
     Node(int d){
		 data=d;
		 next=null;
	 }
	}
    LinkedList(){
		head=null;
	}
  void addLast(int d){
	Node newNode = new Node(d);
		if(head==null){
			head=newNode;
		}
		else{
			Node temp= head;
			while(temp.next!=null){
			//	temp= temp.next;
			
			 newNode.next=temp.next;
			 temp.next=newNode;
		}
	}
  }
	void reverse(){
		
		if(head!=null){
		Node prev=head;
		Node temp= head;
		Node cur=head.next;
	    }	
       else{
		   prev.next=null;
			while(cur!=null){
			temp=cur.next;
			cur.next=prev;
			prev=cur;
			cur=temp;
			}
			head=prev;
	   }
	}
			
	void display(){
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.data);
		}
		temp=temp.next;
	}
   public static void main(String args[]){
	   LinkedList sc = new LinkedList();
	   sc.addLast(10);
	   sc.addLast(20);
	   sc.addLast(30);
	   sc.display();
	   sc.reverse();
   }
}