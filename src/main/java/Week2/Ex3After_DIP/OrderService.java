/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.Ex3After_DIP;


/**
 *
 * @author WINCHESTER
 */
public class OrderService {

    IDatabase database;

    //use dependency injection(constructor based)
    public OrderService(IDatabase database) {
        
        this.database=database;
    }
     
    public void placeOrder(String order) {
        System.out.println("Placing order: " + order);
        database.saveOrder(order);
    }

}
