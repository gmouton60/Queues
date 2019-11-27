//Student Name: Gerald Mouton
//LSU ID: 894569516
//Lab Section: 1
//Assignment: 10
//Submission Time: 5:00
package paneracheese;
import java.util.*;
/**
 *
 * @author gmouto6
 */
public class PaneraCheese {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates the queue essentially by creating an object of the orderList Class
        OrderList myList = new OrderList();
        //will keep running as long as the user allows it
        while(true){
            //shows the menu to the user
            System.out.printf("Select one of the following:\n\t1 - Place an order\n\t2 - Serve next order\n\t3 - List all orders\n\t4 - Cancel an order\n\t5 - Exit Program\n");
            //gets the users choice
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            //switch statement lets the user decide which task they would like the program to perform
            switch(choice){
                case 1: {myList.placeOrder(); break;}
                case 2: {myList.serveOrder(); break;}
                case 3: {myList.listOrders(); break;}
                case 4: {myList.CancelOrder(); break;}
                case 5: {return;}
                default:{System.out.println("Invalid Choice"); break;}
            }
        }
    }
}