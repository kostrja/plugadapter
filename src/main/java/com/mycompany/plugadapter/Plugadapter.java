/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.plugadapter;

/**
 *
 * @author jimko
 */
public class Plugadapter {

    public static void main(String[] args) {
        // an american plug
        Plug americanPlug = new Plug();
        americanPlug.setType("AMERICAN");
        
        // a european plug
        Plug euroPlug = new Plug();
        euroPlug.setType("EURO");
        
        // a european socket
        Socket euroSocket = new Socket();
        euroSocket.setType("EURO");
        
        // this adapter temporarily converts a european socket into one that can be read by an american plug
        Adapter euroToAmerican = new Adapter();
        euroToAmerican.setStartingSocketType("EURO");
        euroToAmerican.setEndingSocketType("AMERICAN");
        
        
        // Labeled tests
        System.out.println("Euro plug in Euro socket: ");
        conn(euroSocket, euroPlug);
        
        System.out.println("\nAmerican plug in Euro socket:");
        conn(euroSocket, americanPlug);
        
        System.out.println("\nAmerican plug in Euro socket:");
        conn(euroToAmerican.conv(euroSocket), americanPlug);
        

        
    }
    
    public static void conn (Socket s, Plug p) {
        if (s.getType().equals(p.getType())) {
            System.out.println("Connection successful");
        }
        else System.out.println("Connection failed");
    }
}
