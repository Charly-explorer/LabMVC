/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Utils.UtilDate;

/**
 *
 * @author zulay
 */
public class Quote {
   private String id;
   private String custumer;
   private UtilDate date;
   private UtilDate hour;
   private String reason;
   private String medic;

    public String getId() {
        return id;
    }

    public String getCustumer() {
        return custumer;
    }

    public UtilDate getDate() {
        return date;
    }

    public UtilDate getHour() {
        return hour;
    }

    public String getReason() {
        return reason;
    }

    public String getMedic() {
        return medic;
    }

    public void setDate(UtilDate date) {
        this.date = date;
    }

    public void setHour(UtilDate hour) {
        this.hour = hour;
    }

    public Quote(String id, String custumer, UtilDate date, UtilDate hour, String reason, String medic) {
        this.id = id;
        this.custumer = custumer;
        this.date = date;
        this.hour = hour;
        this.reason = reason;
        this.medic = medic;
    }
    
    public Quote(){
        this("","",null,null,"","");
    }

    @Override
    public String toString() {
        return "Quote{" + "id=" + id + ", custumer=" + custumer + ", date=" + date + ", hour=" + hour + ", reason=" + reason + ", medic=" + medic + '}';
    }
    
    
}
