package Models;

import java.io.Serializable;

public class Customer implements Serializable {
    private String nameCustomer;
    private int ageCustomer;

    public Customer() {
        this.setAgeCustomer(0);
        this.setNameCustomer(null);
    }

    public Customer(String nameCustomer, int ageCustomer) {
        this.nameCustomer = nameCustomer;
        this.ageCustomer = ageCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public int getAgeCustomer() {
        return ageCustomer;
    }

    public void setAgeCustomer(int ageCustomer) {
        this.ageCustomer = ageCustomer;
    }

    @Override
    public String toString() {
        return "Name: " + this.nameCustomer + ",\t Age: " + this.ageCustomer + ".";
    }

}
