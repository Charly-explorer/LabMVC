package Models;

import Utils.UtilDate;
import java.time.LocalDate;


public class Person {
    private int id;
    private String name;
    private LocalDate birthdate;
    private String phone;
    private String email;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person(int id, String name, LocalDate birthdate,String phone,String email) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.phone=phone;
        this.email=email;
    }
    
    public Person(int id, String name, LocalDate birthdate,String email) {
        this(id,name,birthdate,null,email);
    }
    
    public Person(int id) {
        this(id,null,null,null,null);
    }
    
    public Person() {
        this(0);
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", birthdate=" + birthdate + ", phone=" + phone + ", email=" + email;
    }
 
}
