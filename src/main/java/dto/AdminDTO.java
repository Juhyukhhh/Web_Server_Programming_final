package dto;

public class AdminDTO {
	private String admin_id;
	private String password;
	private String name;
	
	public AdminDTO(String admin_id, String password, String name) {
		this.admin_id = admin_id;
		this.password = password;
		this.name = name;
	}
	
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
