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
public class Team01activity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Order o = new Order("Ordered");
        customer c = new customer("Pavani","5670 Sherbrooke");
        o.display();
        c.display();
        

    }
    
}
