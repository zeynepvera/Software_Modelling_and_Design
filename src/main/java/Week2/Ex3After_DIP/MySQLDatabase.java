/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.Ex3After_DIP;


/**
 *
 * @author WINCHESTER
 */
public class MySQLDatabase implements IDatabase {

    @Override
    public void saveOrder(String order) {
        System.out.println("saving order in MYSQL: "+ order);    }
     
    
}
