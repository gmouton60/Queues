//Student Name: Gerald Mouton
//LSU ID: 894569516
//Lab Section: 1
//Assignment: 10
//Submission Time: 5:00


package paneracheese;

import java.time.*;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author gmouto6
 */

//Creates the object for the order
public class Order {
    private String description;
    private String customer;
    private LocalDateTime orderTime;
    
    //Conctructor initializes the time the order was placed
    public Order(String Description, String name){
        this.description = Description;
        this.customer = name;
        this.orderTime= java.time.LocalDateTime.now();
    }
    
    //override the string method to make it print the name description and time
    //of the order for when we use list all orders
    @Override
    public String toString(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        return String.format("%-15s%-15s%-15s", this.customer, this.description, this.orderTime.format(dtf));
    }
    //this is need so class OrderList can access the names
    public String getName(){
        return this.customer;
    }
}
