package model;

public class ProductsVO {
	private int num;
	private String model_id; 
	private String category;
	private int wh;
	private int on_mode;
	private int off_mode;
	private String company;
	private int sort;
	public ProductsVO(int num, String model_id, String category, int wh, int on_mode, int off_mode, String company,
			int sort) {
		super();
		this.num = num;
		this.model_id = model_id;
		this.category = category;
		this.wh = wh;
		this.on_mode = on_mode;
		this.off_mode = off_mode;
		this.company = company;
		this.sort = sort;
	}
	public ProductsVO(String model_id) {
		
		this.model_id = model_id;
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
	public int getWh() {
		return wh;
	}
	public void setWh(int wh) {
		this.wh = wh;
	}
	public int getOn_mode() {
		return on_mode;
	}
	public void setOn_mode(int on_mode) {
		this.on_mode = on_mode;
	}
	public int getOff_mode() {
		return off_mode;
	}
	public void setOff_mode(int off_mode) {
		this.off_mode = off_mode;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	
	
}
