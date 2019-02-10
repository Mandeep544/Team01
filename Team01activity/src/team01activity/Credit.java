/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team01activity;

/**
 *
 * @author 1894343
 */
public class Credit extends Payment {
    public Credit(String name, String type, String expDate){
        super(name,type,expDate);
    }
    
    public void authorized(){
        System.out.println("authorized payment:");
    }
    
}
