/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author CPM
 */
public class bill {
    private int id;
    private String username;
    private String mobileno;
    private String address;
    private int pin;
    public bill(int id,String username,String mobileno,String address,int pin)
    {
        this.id=id;
        this.username=username;
        this.mobileno=mobileno;
        this.address=address;
        this.pin=pin;
    }
     public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobilno() {
        return mobileno;
    }

    public void setMobilno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    
}
