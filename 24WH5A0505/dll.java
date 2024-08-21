import java.util.Scanner;
class node
{
	int data;
	node next;
	node prev;
	node(int d)
	{
		this.data = d;
		this.prev=null;
		this.next=null;
	}
}
class dll 
{
	node head ,tail ;
	public dll() 
	{
        	this.head = null;
        	this.tail = null;
    	}

	public void insert(int data)
	{
		node newnode=new node(data);
		newnode.next=null;
		if(head==null )
		{

	 		head=newnode;
	 		tail=newnode;
		}
		else
		{
			newnode.prev=tail;
			tail.next=newnode;
			tail=newnode;
		}
	}
	public  void display()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return ;
		}
		else{
		node temp=head;
		while(temp.next!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println(temp.data+" ");
		}

	}
	public void delete()
	{
		node ptr=head;
		node ptr1;
 		if(head==null)
		{		
			System.out.println("LIST IS EMPTY");
			return ;
		}
		else
		{
			System.out.println("deleted element :"+ tail.data);
			tail=tail.prev;
			tail.next=null;
		}
	}
}

class main
{
	public static void main(String []s)
	{
		Scanner sc=new Scanner(System.in);
 		dll d=new dll();
		while(true)
		{
			System.out.println("1:insert at end");
			System.out.println("2:deletion at end");
			System.out.println("3:display");
			System.out.println("4:exit");
			System.out.println("eneter the choice : ");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("enter the data : ");
				int data=sc.nextInt();
				d.insert(data);
				break;
			case 2:
				d.delete();
				break;
			case 3:
				d.display();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("INVALID CHOICE");
				break;
			}
			
		}
	}
}
