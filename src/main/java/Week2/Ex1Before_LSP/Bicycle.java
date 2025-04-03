/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.Ex1Before_LSP;

/**
 *
 * @author WINCHESTER
 */
public class Bicycle extends Vehicle{
      @Override
    public void setSpeed(int speed) {
        if (speed > 50) {
            throw new IllegalArgumentException("Bicycles cannot go above 50 km/h!");
        }
        this.speed = speed;
    }
    
}
