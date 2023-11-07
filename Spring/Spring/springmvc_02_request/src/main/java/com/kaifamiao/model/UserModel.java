package com.kaifamiao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserModel implements Serializable {
    private List<String> id = new ArrayList<>();
    private String name;
    private int age;
    private  AddressModel address;
    private String[] hobby;
    //setetr、getter、toString
    public List<String> getId() {
        return id;
    }
    public void setId(List<String> id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String username) {
        this.name = username;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int userage) {
        this.age = userage;
    }
    public AddressModel getAddress() {
        return address;
    }
    public void setAddress(AddressModel address) {
        this.address = address;
    }
    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }
    @Override
    public String toString() {
        return "UserModel [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", hobby="
                + Arrays.toString(hobby) + "]";
    }

}
