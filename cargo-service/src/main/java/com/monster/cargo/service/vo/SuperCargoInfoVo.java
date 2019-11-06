package com.monster.cargo.service.vo;

public class SuperCargoInfoVo {
	
   private String cargoId;

   private String cargoTypeId;

   public String getCargoId() {
       return cargoId;
   }

   public void setCargoId(String cargoId) {
       this.cargoId = cargoId;
   }

   public String getCargoTypeId() {
       return cargoTypeId;
   }

   public void setCargoTypeId(String cargoTypeId) {
       this.cargoTypeId = cargoTypeId;
   }

    private String custId;

    private String cargoDate;

    private String cargoTime;

    private String stat;

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCargoDate() {
        return cargoDate;
    }

    public void setCargoDate(String cargoDate) {
        this.cargoDate = cargoDate;
    }

    public String getCargoTime() {
        return cargoTime;
    }

    public void setCargoTime(String cargoTime) {
        this.cargoTime = cargoTime;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }
}
