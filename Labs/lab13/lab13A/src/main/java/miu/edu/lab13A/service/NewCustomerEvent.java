package miu.edu.lab13A.service;

import miu.edu.lab13A.domain.Address;

public class NewCustomerEvent {

    private String name;
    private String email;


    public  NewCustomerEvent(String name, String email) {
        this.name = name;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
