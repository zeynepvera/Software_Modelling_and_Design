/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question1UsingCompasition;

/**
 *
 * @author WINCHESTER
 */
public class Test {
    public static void main(String[] args) {
        
        SetColorBlue s1= new SetColorBlue();
        Car c= new Car(s1);
        c.displayColor();
        
        SetColorRed s2= new SetColorRed();
        Bike b= new Bike(s2);
        b.displayColor();
    }
    
}
