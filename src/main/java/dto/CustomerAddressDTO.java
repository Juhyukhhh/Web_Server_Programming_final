package dto;

public class CustomerAddressDTO {
	private int user_address_num;
	private String id;
	private String name;
	private String zipcode;
	private String address;
	private String addressDetail;
	
	public CustomerAddressDTO(int user_address_num, String id, String name, String zipcode, String address, String addressDetail) {
		this.user_address_num = user_address_num;
		this.id = id;
		this.name = name;
		this.zipcode = zipcode;
		this.address = address;
		this.addressDetail = addressDetail;
	}
	
	public int getUser_address_num() {
		return user_address_num;
	}
	public void setUser_address_num(int user_address_num) {
		this.user_address_num = user_address_num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddressDetail() {
		return addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	
}
