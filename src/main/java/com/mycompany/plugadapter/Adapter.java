/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.plugadapter;

/**
 * This adapter will convert the socket type into one that can read the 2nd input plug type
 * @author jimko
 */
public class Adapter {
    String startingSocketType;
    String endingSocketType;

    public Socket conv(Socket s){
        if (s.getType().equals(startingSocketType)) {
            System.out.println("Conversion successful");
            return new Socket(endingSocketType);
        }
        else {
            System.out.println("Conversion unsuccessful");
            return s;
        }
    }

    
    public Adapter() {
    }

    public String getStartingSocketType() {
        return startingSocketType;
    }

    public void setStartingSocketType(String startingSocketType) {
        this.startingSocketType = startingSocketType;
    }

    public String getEndingSocketType() {
        return endingSocketType;
    }

    public void setEndingSocketType(String endingSocketType) {
        this.endingSocketType = endingSocketType;
    }
    

    
}
