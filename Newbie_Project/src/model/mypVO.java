package model;

public class mypVO {
	
	private int num;
	private String model_id;
	private String category;
	private String vip_id;
	private int sort;
	private int wh;
	public mypVO(int num, String model_id, String category, String vip_id, int sort, int wh) {
		
		this.num = num;
		this.model_id = model_id;
		this.category = category;
		this.vip_id = vip_id;
		this.sort = sort;
		this.wh = wh;
	}
	public mypVO(int num, String model_id, String category, String vip_id) {
		this.num = num;
		this.model_id = model_id;
		this.category = category;
		this.vip_id = vip_id;
	}
	public mypVO(String model_id, String vip_id) {
		this.model_id = model_id;
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
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public int getWh() {
		return wh;
	}
	public void setWh(int wh) {
		this.wh = wh;
	}
	
	
	
	
	
	
	
	

	
}
