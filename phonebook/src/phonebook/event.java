package phonebook;

public class event implements comparable{

private String eventTitle;
private String dateAndTime;
private String location;
private String contactName;


public event(String eventTitle, String dateAndTime, String location, String contactName) {
	super();
	this.eventTitle = eventTitle;
	this.dateAndTime = dateAndTime;
	this.location = location;
	this.contactName = contactName;
}



public void eventoOrdred(event e) {
	        // Sort the linked list alphabetically using a custom sort
	        boolean swapped;
	        Node<event> head = null;
			do {
	            swapped = false;
	            Node<event> current = head;
	            Node<event>previous = null;
	            
	            while (current != null && current.getNext() != null) {
	                if (current.getData().getEventTitle().compareTo(current.getNext().getData().getEventTitle()) > 0) {
	                    // Swap nodes if they are out of order
	                    Node<event> temp = current.getNext();
	                    current.setNext(current.getNext().getNext());
	                    temp.setNext(current);
	                    if (previous != null) {
	                        previous.setNext(temp);
	                    } else {
	                        head = temp;
	                    }
	                    swapped = true;
	                }
	                previous = current;
	                current = current.getNext();
	            }
	        } while (swapped);

	        // Display the sorted linked list
	        Node<event> current = head;
	        System.out.println("Sorted List:");
	        while (current != null) {
	            System.out.println(current.getData().getEventTitle());
	            current = current.getNext();
	        }
	    }
	



public String getEventTitle() {
	return eventTitle;
}
public void setEventTitle(String eventTitle) {
	this.eventTitle = eventTitle;
}
public String getDateAndTime() {
	return dateAndTime;
}
public void setDateAndTime(String dateAndTime) {
	this.dateAndTime = dateAndTime;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getContactName() {
	return contactName;
}
public void setContactName(String contactName) {
	this.contactName = contactName;
}

	
	
}
	 
