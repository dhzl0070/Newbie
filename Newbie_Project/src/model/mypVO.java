package model;

public class mypVO {
	
	private int num;
	private String model_id;
	private String category;
	private String vip_id;
	public mypVO(int num, String model_id, String category, String vip_id) {
		this.num = num;
		this.model_id = model_id;
		this.category = category;
		this.vip_id = vip_id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getModel_id() {
		return model_id;
	}
	public void setModel_id(String model_id) {
		this.model_id = model_id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getVip_id() {
		return vip_id;
	}
	public void setVip_id(String vip_id) {
		this.vip_id = vip_id;
	}
	
	
	
	
	
	
	
	
	
	

	
}
