package model;


public class userVO {

	private String vip_id;
	private String vip_pw;
	private String name;
	private int age;
	private int hp;
	
	public userVO(String vip_id, String vip_pw, String name, int age, int hp) {
		this.vip_id = vip_id;
		this.vip_pw = vip_pw;
		this.name = name;
		this.age = age;
		this.hp = hp;
	}
	public userVO(String vip_id, String vip_pw) {
		this.vip_id = vip_id;
		this.vip_pw = vip_pw;
	}
	public userVO(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getVip_id() {
		return vip_id;
	}
	public void setVip_id(String vip_id) {
		this.vip_id = vip_id;
	}
	public String getVip_pw() {
		return vip_pw;
	}
	public void setVip_pw(String vip_pw) {
		this.vip_pw = vip_pw;
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
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	
	
}
