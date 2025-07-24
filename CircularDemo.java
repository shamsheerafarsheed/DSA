package LinkedListDemo;
class CircularNode
{
	int data;
	CircularNode next;
	CircularNode(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class CircularLinkedList
{
	//head-->first element
	CircularNode head=null;
	CircularNode tail=null;
	
	void insert(int data)
	{
		CircularNode newNode=new  CircularNode(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			newNode.next=head;//circular link
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
			tail.next=head;//maintain circularity
			
		}
	}
	void display()
	{
		if(head==null)
			return;
		CircularNode temp=head;
		do
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		while(temp!=head);
		{
			System.out.print("back to head");
			
		}
	}}
public class CircularDemo {

	public static void main(String[] args) {
		CircularLinkedList cl=new CircularLinkedList();
		cl.insert(23);
		cl.insert(33);
		cl.insert(46);
		cl.insert(70);
		cl.display();
				
		

	}

}
