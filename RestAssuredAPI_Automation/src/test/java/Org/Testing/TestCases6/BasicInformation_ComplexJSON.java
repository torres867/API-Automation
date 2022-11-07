package Org.Testing.TestCases6;

public class BasicInformation_ComplexJSON 
{
	private String First_Name;
	private String Last_Name;
	private String id;
	private String Designation;
	private AddressInformation_ComplexJSON address;
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
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
	public AddressInformation_ComplexJSON getAddress() {
		return address;
	}
	public void setAddress(AddressInformation_ComplexJSON address) {
		this.address = address;
	}
}
