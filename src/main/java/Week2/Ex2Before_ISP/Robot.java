/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.Ex2Before_ISP;

/**
 *
 * @author WINCHESTER
 */
public class Robot implements Worker {
    
        @Override
    public void work() {
        System.out.println("Robot is working...");
    }

    @Override
    public void eat() {
        // Robots do not eat, but they must implement this method
        throw new UnsupportedOperationException("Robots do not eat!");
    }

    @Override
    public void sleep() {
        // Robots do not sleep, but they must implement this method
        throw new UnsupportedOperationException("Robots do not sleep!");
    }
}
