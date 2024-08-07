package miu.edu.lab12Part4.domain;

public class Customer {
    private String name;
    private String email;
    private Address address;

    public Customer(String name, String email, Address address) {
        this.name = name;
        this.email = email;
        this.address = address;
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

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString() {
        return "Customer [name=" + name + ", email=" + email + ", address=" + address + "]";
    }

}
