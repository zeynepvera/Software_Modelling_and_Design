/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question1UsingCompasition;

/**
 *
 * @author WINCHESTER
 */
public class Vehicle {
    IColor colorSetter;
    public Vehicle(IColor colorSetter){
        this.colorSetter=colorSetter;
        
    }
    
    void displayColor(){
        colorSetter.setColor();
    }
    
    
}
