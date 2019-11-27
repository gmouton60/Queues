//Student Name: Gerald Mouton
//LSU ID: 894569516
//Lab Section: 1
//Assignment: 10
//Submission Time: 5:00

package paneracheese;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author gmouto6
 */
public class OrderList {
    //Queue that holds holds all the orders
    private Queue<Order> myQ = new LinkedList<>();
    
    //lets the user place an order with a description and a name for 
    //the order and stores it in the Queue
    public void placeOrder(){
        Scanner in = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Please enter order description:");
        String description = in.next();
        
        System.out.println("Please enter the customer's name:");
        String customerName= in.next();
        myQ.add(new Order(description,customerName));
    }
    
    //Shows all orders in FIFO order
    public void listOrders(){
        if(myQ.isEmpty()){
            System.out.println("No pending orders!");
        }
        else{
            System.out.printf("%-15s%-15s%-15s\n","Name","Order","Time");
            System.out.println("--------------------------------------");
            //prints all the orders in the Queue
            for(Order r: myQ){
                System.out.println(r.toString());
            }
        }
    }
    
    
    //Removes the order from the Queue that was first in line
    public void serveOrder(){
        if(myQ.isEmpty()){
            System.out.println("No pending orders!");
        }
        else{
            System.out.println("Now Serving "+ myQ.poll().getName());
        }
    }
    
    
    //Checks to see if the Queue is empty, if not checks to see if the name 
    //of the person the order corresponds to is in the Queue and if it finds it
    //it removes it
    public void CancelOrder(){
        if(myQ.isEmpty()){
            System.out.println("No pending orders!");
        }
        else{
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter customer's name:");
            String name = in.next();
            if(myQ.removeIf((Order r)-> r.getName().equalsIgnoreCase(name))){
                System.out.println(name + "'s order has been cancelled.");
            }
            else{
                System.out.println(name + " is not in the list of orders");
            }
        }
    }
}

