package LinkedListDemo;
class DoublyNode
{
	int data;
	DoublyNode next,prev;
	DoublyNode(int data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
class DoublyLinkedList
{
	//head-->first element
	DoublyNode head;
	void insert(int data)
	{
		DoublyNode newNode=new  DoublyNode(data);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			DoublyNode temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.prev=temp;
			
		}
	}
	void displayForward()
	{
		DoublyNode temp=head;
		System.out.println("Forward:");
		while(temp!=null)
		{
			System.out.print(temp.data+" <->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	void displayBackward()
	{
		DoublyNode temp=head;
		if(temp==null)
			return;
		//go to the last node
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		//print in reverse
		System.out.println("Backward:");
		while(temp!=null)
		{
			System.out.print(temp.data+" <->");
			temp=temp.prev;
		}
		System.out.println("null");
	}
}

		
public class DoublyLinkdLstDemo {

	public static void main(String[] args) {
		DoublyLinkedList obj=new DoublyLinkedList();
		obj.insert(110);
		obj.insert(210);
		obj.insert(450);
		obj.displayForward();
		obj.displayBackward();
		

	
	}

}
