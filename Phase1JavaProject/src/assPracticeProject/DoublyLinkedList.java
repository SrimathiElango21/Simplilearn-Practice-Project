package assPracticeProject;

public class DoublyLinkedList {
	
	 private static class Node
	   {
	      String name;
	      Node next;
	      Node prev;
	   }

	public static void main(String[] args) {
		
		  Node frontForward = new Node();
	      frontForward.name = "ja";
	      
	      Node temp = new Node();
	      temp.name = "smith";
	      
	      Node topBackward = new Node();
	      topBackward.name = "k.k";
	      
	      frontForward.next = temp;
	      temp.next = topBackward;
	      topBackward.next = null;
	      
	      topBackward.prev = temp;
	      temp.prev = frontForward;
	      frontForward.prev = null;
	      
	      System.out.print("Forward singly-linked list: ");
	      temp = frontForward;
	      while (temp != null)
	      {
	         System.out.print(temp.name);
	         temp = temp.next;
	      }
	      System.out.println();
	      System.out.print("Backward singly-linked list: ");
	      temp = topBackward;
	      while (temp != null)
	      {
	         System.out.print(temp.name);
	         temp = temp.prev;
	      }
	      System.out.println();
	      

	}

}
