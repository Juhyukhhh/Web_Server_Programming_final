package dto;

public class OrderTableDTO {
	private int order_num;
	private String id;
	private String order_date;
	private String name;
	private String zipcode;
	private String address;
	private String addressDetail;
	
	public OrderTableDTO(int order_num, String id, String order_date, String name, String zipcode, String address, String addressDetail) {
		this.order_num = order_num;
		this.id = id;
		this.order_date = order_date;
		this.name = name;
		this.zipcode = zipcode;
		this.address = address;
		this.addressDetail = addressDetail;
	}
	
	public int getOrder_num() {
		return order_num;
	}
	public void setOrder_num(int order_num) {
		this.order_num = order_num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
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
