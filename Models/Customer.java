package Models;

import Utils.UtilDate;
import java.time.LocalDate;

/**
 *
 * @author jprod
 */
public class Customer extends Person {

    private int getAge() {
        return (super.getBirthdate() != null) ? UtilDate.calculateYears(super.getBirthdate()) : 0;
    }

    public Customer(int id, String name, LocalDate birthdate, String phone, String email) {
        super(id, name, birthdate, phone, email);
    }

    public Customer(int id, String name, LocalDate birthdate, String email) {
        this(id, name, birthdate, null, email);
    }

    public Customer(int id) {
        this(id, null, null, null, null);
    }

    public Customer() {
        this(0);
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+ '}';
    }

  
   

}
