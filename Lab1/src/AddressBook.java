import java.util.*;

public class AddressBook {

	private ArrayList<BuddyInfo> buddyList;
	
	

	public AddressBook(){
		
		this.buddyList = new ArrayList<BuddyInfo>();		
	}

	public void add(BuddyInfo e) {
		 buddyList.add(e);
	}


	public void remove(BuddyInfo o) {
		 buddyList.remove(o);
	}
	
	public static void main(String[] args) {
		
		AddressBook ab = new AddressBook();
		
		BuddyInfo ryan;
		ryan = new BuddyInfo();
		ryan.setName("Ryan");
		
		ab.add(ryan);
		System.out.println("This is the address Book: ");
		
		System.out.println("Hello " + ryan.getName());
		
			
	}
	
}