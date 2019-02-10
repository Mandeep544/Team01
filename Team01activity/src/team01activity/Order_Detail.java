/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team01activity;

/**
 *
 * @author Mandeep Kaur
 */
public class Order_Detail extends Order{
    int Quantity;
    String tax_Status;
    
    
    public void Order(int Quantity,String tax_Status)
    {
        this.Quantity=Quantity;
        this.tax_Status=tax_Status;
       
    }
    public void Settax_Status(String t)
    {
        this.tax_Status=t;
    }
    public String gettax_Status()
    {
        return tax_Status;
    }
    
    public void setQuantity(int Q)
    {
        this.Quantity=Q;
    }
    public int getQuantity()
    {
        return Quantity;
    }

    
    public void calc_subtotal()
    {
    
    }
    public void calc_weight()
    {

    }
       public void calc_total()
       {
           }
    public void display()
    {
        System.out.println("Order Quantity  is:"+Quantity  +"tax_Status"+tax_Status);
    }
    
}

