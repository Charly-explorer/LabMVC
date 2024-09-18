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
public class Medico extends Person {

    private static int cont = 1;
    private int idMedico;
    private String specialty;
    private Double salary;

    public int getIdMedico() {
        return idMedico;
    }

    public String getSpecialty() {
        return specialty;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Medico(int idMedico, String specialty, Double salary, int id, String name, LocalDate birthdate, String phone, String email) {
        super(id, name, birthdate, phone, email);
        this.idMedico = cont++;
        this.specialty = specialty;
        this.salary = salary;
    }

    public Medico() {
        this(0, "", 0.0, 0, "", null, "", "");
    }

}
