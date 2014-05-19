package com.customdatastructure;

import java.util.Scanner;

public class SinglyLinkList {
	Node head;
	Node next;
	int size = 0;
	public int getSize() {
		return size;
	}
	private class Node {
		int data;
		Node link;

		public Node(int data, Node link) {

			this.data = data;
			this.link = link;

		}


		public Node() {

			this.data = 0;
			this.link = null;

		}

		

		public Node getLink() {
			return link;
		}

		public void setLink(Node link) {
			this.link = link;
		}

	}
    public boolean isEmpty()

    {

        return head == null;

    }
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

	        /* Creating object of class linkedList */

	        SinglyLinkList list = new SinglyLinkList();
			System.out.println("Singly Linked List Test\n");          

		        char ch;

		        /*  Perform list operations  */

		        do

		        {

		            System.out.println("\nSingly Linked List Operations\n");

		            System.out.println("1. insert at begining");

		            System.out.println("2. insert at end");

		            System.out.println("3. insert at position");

		            System.out.println("4. delete at position");
		            
		            System.out.println("5. delete at first");

		            System.out.println("6. check empty");

		            System.out.println("7. get size");            

		            int choice = scan.nextInt();            

		            switch (choice)

		            {

		            case 1 : 

		                System.out.println("Enter integer element to insert");

		                list.insertNodeAtFirst( scan.nextInt() );                     

		                break;                          

		            case 2 : 

		                System.out.println("Enter integer element to insert");

		                list.insertNodeAtLast( scan.nextInt() );                     

		                break;                         

		            case 3 : 

		                System.out.println("Enter integer element to insert");

		                int num = scan.nextInt() ;

		                System.out.println("Enter position");

		                int pos = scan.nextInt() ;

		                if (pos <= 1 || pos > list.getSize() )

		                    System.out.println("Invalid position\n");

		                else

		                    list.insertNodeAtPosition(num, pos);

		                break;                                          

		            case 4 : 

		                System.out.println("Enter position");

		                int p = scan.nextInt() ;

		                if (p < 1 || p > list.getSize() )

		                    System.out.println("Invalid position\n");

		                else

		                    list.deleteNodeAtPos(p);

		                break;
		            case 5 : 

		               

		                

		                    list.deleteNodeAtFirst();

		                break;

		            case 6 : 

		                System.out.println("Empty status = "+ list.isEmpty());

		                break;                   

		            case 7 : 

		                System.out.println("Size = "+ list.getSize() +" \n");

		                break;                         

		             default : 

		                System.out.println("Wrong Entry \n ");

		                break;   

		            }

		            /*  Display List  */ 

		            list.travese();

		            System.out.println("\nDo you want to continue (Type y or n) \n");

		            ch = scan.next().charAt(0);                        

		        } while (ch == 'Y'|| ch == 'y');

	}

	private void insertNodeAtFirst(int data) {
		Node newNode = new Node(data, null);
		size++;
		if (head == null && next == null) {
			head = newNode;
			next = newNode;
		} else {
			newNode.setLink(head);
			head = newNode;
		}
	}

	private void insertNodeAtLast(int data) {
		Node newNode = new Node(data, null);
		Node temp;
		size++;
		if (head == null && next == null) {
			head = newNode;
			next = newNode;
		} else {
			temp = next;
			temp.setLink(newNode);
			next = newNode;
			temp = null;
		}
	}
	private void insertNodeAtPosition(int data,int pos) {
		Node newNode = new Node(data, null);
		Node prev = null ;
		Node tmp=head;

		if (head == null && next == null) {
			System.out.println("List is empty");
			return ;
		} else {
			if(pos>size){
				System.out.println("No position exist");
				return ;
			}
		
			
					for(int j =1;j<pos;j++){
						prev=tmp;
						tmp= tmp.getLink();
					}
					newNode.setLink(prev.getLink());
					prev.setLink(newNode);
					
					tmp=null;
					prev=null;
				}
			
		
		size++;
	}
	private void deleteNodeAtFirst() {
		
	Node tmp;
	tmp=head;
	tmp =null;
	head=head.getLink();
		size--;
	}
	private void deleteNodeAtPos(int pos) {
		
		Node nxt = null ;
		Node tmp=head;

		if (head == null && next == null) {
			System.out.println("List is empty");
			return ;
		} else {
			if(pos>size){
				System.out.println("No position exist");
				return ;
			}
		
			
					for(int j =1;j<pos;j++){
						nxt=tmp;
						tmp= tmp.getLink();
					}
					nxt.setLink(tmp.getLink());
				
					
					tmp=null;
					nxt=null;
				}
			
		
			size--;
		}

	private void travese() {
		Node tmp=head;
		System.out.print("\n");
		while (tmp != null) {
			System.out.print("[" + tmp.data + "]->");

			tmp = tmp.getLink();
		}
		System.out.print("\n");
		tmp=null;
	}
}
