/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.Ex1After_LSP;

/**
 *
 * @author WINCHESTER
 */
public class Car implements Vehicle {

    private int speed;

    @Override
    public void setSpeed(int speed) {
        this.speed=speed;

    }

    // No issues, a car can have any speed
    @Override
    public int getSpeed() {
        return speed;
    }

}
