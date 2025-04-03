/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.Ex3Before_DIP;

/**
 *
 * @author WINCHESTER
 */
public class OrderService {
    private MySQLDatabase database;

    public OrderService() {
        this.database = new MySQLDatabase(); 
    }

    public void placeOrder(String order) {
        System.out.println("Placing order: " + order);
        database.saveOrder(order);
    }
    
}
