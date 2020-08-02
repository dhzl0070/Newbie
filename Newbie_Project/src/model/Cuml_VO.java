package model;
import java.sql.Date;

public class Cuml_VO {

	int cuml_id;
	String model_id;
	double fare;
	int cmlt_time;
	String date;
	String type_selected;
	int commaNum;
	
	public Cuml_VO(int cuml_id, String model_id, int fare, int cmlt_time, String date) {
		super();
		this.cuml_id = cuml_id;
		this.model_id = model_id;
		this.fare = fare;
		this.cmlt_time = cmlt_time;
		this.date = date;
		
	}
	
	public Cuml_VO(String model_id, double fare, int cmlt_time) {
		this.model_id = model_id;
		this.fare = fare;
		this.cmlt_time = cmlt_time;
	}

	public Cuml_VO(String type_selected, int commaNum) {
		super();
		this.type_selected = type_selected;
		this.commaNum = commaNum;
	}
	
	public Cuml_VO(String model_id, int fare, int cmlt_time) {
		super();
		this.model_id = model_id;
		this.fare = fare;
		this.cmlt_time = cmlt_time;
	}

	public String gettype_selected() {
		return type_selected;
	}
	public int getcommaNum() {
		return commaNum;
	}
	
	public int getCuml_id() {
		return cuml_id;
	}
	public void setCuml_id(int cuml_id) {
		this.cuml_id = cuml_id;
	}
	public String getModel_id() {
		return model_id;
	}
	public void setModel_id(String model_id) {
		this.model_id = model_id;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public int getCmlt_time() {
		return cmlt_time;
	}
	public void setCmlt_time(int cmlt_time) {
		this.cmlt_time = cmlt_time;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
