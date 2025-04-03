/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.Ex3After_DIP;


/**
 *
 * @author WINCHESTER
 */
public class BadDIPExample {
     public static void main(String[] args) {
         
         IDatabase database= new MySQLDatabase();
         OrderService os= new OrderService(database);
         os.placeOrder("laptop");
         
        
    }
    
}
