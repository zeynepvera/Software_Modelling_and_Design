/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question3_IoC;

/**
 *
 * @author WINCHESTER
 */
public class RepairService {
    private ICar car;
    
    public RepairService(ICar car){
        this.car=car;
    }
    
 public String repair() {
        return "Repairing " + car.getModel() + ". The car is now fixed.";
    }    
}
