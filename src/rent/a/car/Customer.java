/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent.a.car;

/**
 *
 * @author hp
 */
public class Customer {
    private int id;
    private String FirstName;
    private String LastName;
    private String Email;
    private String PhoneNumber;
    private Car RentedCar;

    public Customer(int id, String FirstName, String LastName, String Email, String PhoneNumber) {
        this.id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
 
    }
   
    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Car getRentedCar() {
        return RentedCar;
    }

    public void setRentedCar(Car RentedCar) {
        this.RentedCar = RentedCar;
    }
    
    
    
    
}
