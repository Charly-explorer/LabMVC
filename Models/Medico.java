/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;

/**
 *
 * @author Johel M
 */
public class Medico {
    private static int cont=1;
    private int idMedico;
    private int id;
    private String name;
    private LocalDate birthdate;
    private String phone;
    private String email;
    private String specialty;
    private Double salary;

    public int getIdMedico() {
        return idMedico;
    }

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

    public String getSpecialty() {
        return specialty;
    }

    public Double getSalary() {
        return salary;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Medico(int id, String name, LocalDate birthdate, String phone, String email, String specialty, Double salary) {
        this.idMedico = cont++;
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.phone = phone;
        this.email = email;
        this.specialty = specialty;
        this.salary = salary;
    }

    public Medico() {
        this(0,"",null,"","","",0.0);
    }

    @Override
    public String toString() {
        return "Medico{" + "idMedico=" + idMedico + ", id=" + id + ", name=" + name + 
                ", birthdate=" + birthdate + ", phone=" + phone + ", email=" + email + 
                ", specialty=" + specialty + ", salary=" + salary + '}';
    }
    
    
    
    
}
