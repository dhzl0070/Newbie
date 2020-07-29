package Login;


public class VO {

	private String id;
	private String pw;
	private String name;
	private int age;
	private int phoneNumber;
	
	public VO(String id, String pw, String name, int age, int phoneNumber) {
		
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public VO(String name, int age) {
	}

	public VO(String id, String pw, String name, int age) {
	}

	public VO(String id, String pw) {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	
}
