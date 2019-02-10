/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team01activity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 1895730
 */
public class Order {
    Date date= parseDate("2019-2-10");
    String status;
    public void Order(Date date,String status)
    {
        this.date=date;
        this.status=status;
       
    }
    public void Setstatus(String s)
    {
        this.status=s;
    }
    public String getstatus()
    {
        return status;
    }
    public void setdate(Date d)
    {
        this.date=d;
    }
    public Date getdate()
    {
        return date;
    }
    public void calcSubTotal()
    {
        
    }
    public void calcTax()
    {
        
    }
    public void calcTotal()
    {
    
    }
    public void calcTotalWeight()
    {
        
    }
    public void display()
    {
        System.out.println("Order date is:"+date+"status"+status);
    }
    public static Date parseDate(String date)
    {
        try{
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
}
    
