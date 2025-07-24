package LinkedListDemo;
class SinglyNode
{
	int data;
	SinglyNode next;
	SinglyNode(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class SinglyLinkedList
{
	//head-->first element
	SinglyNode head;
	void insert(int data)
	{
		SinglyNode newNode=new  SinglyNode(data);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			SinglyNode temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
			
		}
	}
	void display()
	{
		SinglyNode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ->");
			temp=temp.next;
		}
		System.out.println("null");
	}
}
public class SinglyLinkedListDemo {

	public static void main(String[] args) {
		SinglyLinkedList obj=new SinglyLinkedList();
		obj.insert(11);
		obj.insert(21);
		obj.insert(45);
		obj.display();
		

	}

}
