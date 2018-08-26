package com.example.annu.bottomnavigation;

public class Person {
    public void setId(int id) {
        this.id = id;
    }

    private int id;
   // private String image;
    private String name;
    private String address;
    private String phone;


    public Person( String name, String address, String phone) {
        this.id= id;
        //this.image = image;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public int getId() { return id;
    }
    /*public String getImage() {
        return name;
    }

    public void setImage(String image) {
        this.name = name;
    }*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
