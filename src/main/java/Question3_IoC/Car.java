/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question3_IoC;

/**
 *
 * @author WINCHESTER
 */
public class Car implements ICar {
    
     private String model;

    public Car(String model) {
        this.model = model;
    }

    public String needsRepair() {
        return model + " needs repair.";
    }

    public String getModel() {
        return model;
    }
    
}
