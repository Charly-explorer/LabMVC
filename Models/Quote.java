/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import static Models.QuoteState.Activo;
import java.time.LocalDate;

/**
 *
 * @author zulay
 */
public class Quote {
   private String id;
   private String custumer;
   private LocalDate date;
   private LocalDate hour;
   private String reason;
   private String medic;
   private QuoteState state;
   
    public String getId() {
        return id;
    }

    public String getCustumer() {
        return custumer;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalDate getHour() {
        return hour;
    }

    public String getReason() {
        return reason;
    }

    public String getMedic() {
        return medic;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setHour(LocalDate hour) {
        this.hour = hour;
    }

    public Quote(String id, String custumer, LocalDate date, LocalDate hour, String reason, String medic) {
        this.id = id;
        this.custumer = custumer;
        this.date = date;
        this.hour = hour;
        this.reason = reason;
        this.medic = medic;
        this.state = Activo;
    }
    
    public Quote(){
        this("","",null,null,"","");
    }

    @Override
    public String toString() {
        return "Quote{" + "id=" + id + ", custumer=" + custumer + ", date=" + date + ", hour=" + hour + ", reason=" + reason + ", medic=" + medic + '}';
    }
    
    
}
