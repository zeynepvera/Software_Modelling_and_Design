/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.Ex3Before_DIP;

/**
 *
 * @author WINCHESTER
 */
public class BadDIPExample {
     public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.placeOrder("Laptop");
    }
    
}
