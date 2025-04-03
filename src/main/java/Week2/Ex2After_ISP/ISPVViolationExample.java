/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.Ex2After_ISP;

import Week2.Ex2Before_ISP.*;

/**
 *
 * @author WINCHESTER
 */
public class ISPVViolationExample {
    public static void main(String[] args) {
        
        Worker robot = new Robot();
        Human  human = new Human();

        robot.work();
        human.eat();
        human.sleep();
        human.work();
 
       
    }
    
}
