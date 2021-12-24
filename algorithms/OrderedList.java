package com.bridgelabz.algorithms;
import java.util.Scanner;

/*
 * Class of Ordered List
 */
public class OrderedList {
	
	public class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	 }
         
		Node head;
		Node tail;
		int size = 0;
		
		/*
		 * Create/add new node in linked list
		 */
	public void LinkedList(int data) {
			Node node = new Node(data);
			if (head == null) {
				head = node;
				tail = node;
			} else {
				tail.next = node;
				tail = tail.next;
			}
		}
	   /*
		 * Delete data node using delete node method
		 */
	    public void deleteNode(int key) {
	        if (head == null) {
	            System.out.println("Linked List is empty");
	        } else {
	            Node temp = head;
	            if (head.data == key) {
	                head = head.next;
	                size--;
	            }
	            while (temp != null && temp.next != null) {
	                if (temp.next.data == key) {
	                    temp.next = temp.next.next;
	                    size--;
	                }
	                temp = temp.next;
	            }
	        }
	    }
	    /**
	     * Display method 
	     */
		public void display() {
			Node temp = head;
			if (head == null) {
				System.out.println("Linked list is empty");
			} else {
				while (temp != null) {
					System.out.println(temp.data + "->");
					temp = temp.next;
				}
			}
		}
	/**
	 * Sort the data using sort method
	 */
       public void sort() {
    	   //node current will point to head
    	   Node current = head,index =null;
    	   int temp;
			if (head == null) {
            return;		
            } else {
				while(current!=null) {
					//node index will point to node next to current
				index = current.next;
				
				while(index!=null) {
					//if current node data is greater than index node data, swap the data between them
					if(current.data>index.data) {
						temp =current.data;
						current.data=index.data;
						index.data=temp;
					}
					index = index.next;
				}
			  current =current.next;	
			}
					
		  }
		}
  	       	   
	   	// main method
		public static void main(String[] args) {
			OrderedList obj = new OrderedList();
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the data node");
            int data1 = sc.nextInt();
            int data2 = sc.nextInt();
            int data3 = sc.nextInt();
            int data4 = sc.nextInt();
            
	        obj.LinkedList(data1);
	        obj.LinkedList(data2);
	        obj.LinkedList(data3);
	        obj.LinkedList(data4);
	        System.out.println("Display list node before sorting");
	        obj.display();
	        System.out.println("After sorting list");
	        obj.sort();
	        obj.display();
	        System.out.println("Enter a number for pop operation");
	        int numberpos = sc.nextInt();
	        System.out.println("do Pop operation");
		    System.out.println("display after pop");    
	        obj.deleteNode(numberpos);

	        System.out.println("do Pop operation");
	        obj.display();
	        System.out.println("sort after pop and display");
	        obj.sort();
	        obj.display();
        
		}		
}
