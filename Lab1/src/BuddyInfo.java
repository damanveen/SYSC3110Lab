
public class BuddyInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		BuddyInfo ryan;
		ryan = new BuddyInfo();
		ryan.setName("Ryan");
		
		System.out.println("Hello " + ryan.getName());
	}
	
	
	String name;
	int phone; 
	String address; 
	
	public BuddyInfo(){
		
		
		
	}

	public void Test(){
		
		//this is new test code for testing branches in GIT
		
		//online edits
		
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
