/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2_SingleResponsibility;

/**
 *
 * @author WINCHESTER
 */
// Example usage
public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota");
        RepairServices r = new RepairServices();
        r.setVehicle(vehicle);
        r.repair();

        r.setVehicle(new Vehicle("sedan"));
        r.repair();

    }

}
