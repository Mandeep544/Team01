/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team01activity;

/**
 *
 * @author 1895730
 */
public class customer {
    String cname;
    String address;
    public customer(String cname,String address)
    {
        this.cname=cname;
        this.address=address;
    }
    public void setcname(String c)
            
    {
        this.cname=c;
    }
   public void setaddress(String a)
   {
       this.address=a;
   }
   public String getcname()
   {
       return cname;
   }
   public String getaddress()
   {
       return address;
   }
   public void display()
   {
       System.out.println("Customer name is:" +cname +"address" +address);
   }
}
