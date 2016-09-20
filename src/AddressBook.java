import java.util.*;

public class AddressBook {

	private ArrayList<BuddyInfo> buddyList;
	
	

	public AddressBook(BuddyInfo buddy){
		
		this.buddyList = new ArrayList<BuddyInfo>();		
	}

	public void add(BuddyInfo e) {
		 buddyList.add(e);
	}


	public void remove(BuddyInfo o) {
		 buddyList.remove(o);
	}
	
	public static void main(String[] args) {
		
		System.out.println("This is the address Book: ");
		
	
	}
	
}
