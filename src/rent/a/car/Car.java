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
public class Car {
    private int id;
    private String Brand;
    private String Make;
    private double pricePerDay;

    public Car(int id, String Brand, String Make, double pricePerDay) {
        this.id = id;
        this.Brand = Brand;
        this.Make = Make;
        this.pricePerDay = pricePerDay;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }
    
    
}
