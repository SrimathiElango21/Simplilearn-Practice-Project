package assPracticeProject;

public class SinglyLinkedList {
	
	 Node head; 
	 static class Node {
	 
	        int data;
	        Node next;
	 
	        // Constructor
	        Node(int d)
	        {
	            data = d;
	            next = null;
	        }
	    }
	  public static SinglyLinkedList insert(SinglyLinkedList list, int data)
	    {
	        Node new_node = new Node(data);
	        new_node.next = null;
	 	        if (list.head == null) {
	            list.head = new_node;
	        }
	        else {
	           	     Node last = list.head;
	                   while (last.next != null) {
	                	   last = last.next;
	            }
	 
	        last.next = new_node;
	        }
	 
	     return list;
	    }
	 
	  public static void printList(SinglyLinkedList list)
	    {
	        Node currNode = list.head;
	        System.out.print("\nLinkedList: ");
	 	        while (currNode != null) {
	           	  System.out.print(currNode.data + " ");
	                currNode = currNode.next;
	        }
	        System.out.println("\n");
	    }
	public static SinglyLinkedList deleteByKey(SinglyLinkedList list,int key)
	    {
	       
	        Node currNode = list.head, prev = null;
	 	        if (currNode != null && currNode.data == key) {
	            list.head = currNode.next; // Changed head
	 	            System.out.println(key + " found and deleted");
	 	            return list;
	        }
		    while (currNode != null && currNode.data != key) {
	            prev = currNode;
	            currNode = currNode.next;
	        }
	 	        if (currNode != null) {
	            	   prev.next = currNode.next;
	                   System.out.println(key + " found and deleted");
	        }
		        if (currNode == null) {
	           	      System.out.println(key + " not found");
	        }
	 	        return list;
	    }  
    public static SinglyLinkedList deleteAtPosition(SinglyLinkedList list, int index)
	    {
	       	        Node currNode = list.head, prev = null;
	 	        if (index == 0 && currNode != null) {
	            list.head = currNode.next; 	 
	            
	            System.out.println(
	                index + " position element deleted");
	 
	           	            return list;
	        }
	 	        int counter = 0;
	 	        while (currNode != null) {
	 
	            if (counter == index) {
	            	prev.next = currNode.next;
	                 System.out.println(index + " position element deleted");
	                break;
	            }
	            else {
	               	 prev = currNode;
	                currNode = currNode.next;
	                counter++;
	            }
	        }
	 	        if (currNode == null) {
	            
	            System.out.println(
	                index + " position element not found");
	        }
	 
	        return list;
	    }

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		 
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        
 
         printList(list);
         deleteByKey(list, 1);
         printList(list);
         deleteByKey(list, 10);
         printList(list);
         deleteAtPosition(list, 0);
         printList(list);       
       
	}

}
