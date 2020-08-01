package model;



public class cal_VO {

   private int watt;
   private int onMode;
   private int offMode;
   private String model_id;
   private String category;
   private int num;
   private String vip_id;
   
   
   public cal_VO(int watt, int onMode, int offMode, String model_id, String cagegory) {
      super();
      this.watt = watt;
      this.onMode = onMode;
      this.offMode = offMode;
      this.model_id = model_id;
      this.category = cagegory;
   }

   

   public cal_VO( int num, String model_id, String category) {
      this.model_id = model_id;
      this.category = category;
      this.num = num;
   }


   public cal_VO(String model_id, String category, int watt) {
      this.model_id = model_id;
      this.category = category;
      this.watt = watt;
   }






   public int getOffMode() {
      return offMode;
   }

   public void setOffMode(int offMode) {
      this.offMode = offMode;
   }

   
   public int getWatt() {
      return watt;
   }
   public int getOnMode() {
      return onMode;
   }
   
   public void setOnMode(int onMode) {
      this.onMode = onMode;
   }
   public int getNum() {
      return num;
   }
   
   
   
   public void setNum(int num) {
      this.num = num;
   }
   
   
   
   public String getVip_id() {
      return vip_id;
   }
   
   
   
   public void setVip_id(String vip_id) {
      this.vip_id = vip_id;
   }
   public void setWatt(int watt) {
      this.watt = watt;
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
   
   
   
   
   
   
   
   
}