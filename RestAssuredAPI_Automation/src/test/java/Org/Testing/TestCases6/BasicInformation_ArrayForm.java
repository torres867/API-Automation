package Org.Testing.TestCases6;

public class BasicInformation_ArrayForm 
{
	private String FirstName;
	private String LastName;
	private String id;
	private String Designation;
	private AddressInformation_ArrayForm[] Address;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public AddressInformation_ArrayForm[] getAddress() {
		return Address;
	}
	public void setAddress(AddressInformation_ArrayForm[] address) {
		Address = address;
	}
	
}
