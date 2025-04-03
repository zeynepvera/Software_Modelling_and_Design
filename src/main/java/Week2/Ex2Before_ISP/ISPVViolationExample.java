/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.Ex2Before_ISP;

/**
 *
 * @author WINCHESTER
 */
public class ISPVViolationExample {
    public static void main(String[] args) {
        Worker robot = new Robot();
        Worker human = new Human();

        robot.work();
 
        human.work();
        human.eat();
        human.sleep();
    }
    
}
