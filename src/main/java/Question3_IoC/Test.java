/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question3_IoC;

/**
 *
 * @author WINCHESTER
 */
public class Test {
    public static void main(String[] args) {
        
        
        Car c= new Car("Togg");
        RepairService rs= new RepairService(c);
        
        System.out.println(""+ c.needsRepair());
        System.out.println(""+ rs.repair());
    }
}
