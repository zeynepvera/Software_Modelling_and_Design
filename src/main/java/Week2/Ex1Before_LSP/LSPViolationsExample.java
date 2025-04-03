/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.Ex1Before_LSP;

/**
 *
 * @author WINCHESTER
 */
public class LSPViolationsExample {
    
     public static void main(String[] args) {
        Vehicle car = new Car();
        car.setSpeed(100);
        System.out.println("Car speed: " + car.getSpeed()); 

        Vehicle bicycle = new Bicycle();
        bicycle.setSpeed(100);  
    }
}
