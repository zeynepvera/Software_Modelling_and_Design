/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.Ex1After_LSP;


/**
 *
 * @author WINCHESTER
 */
public class LSPViolationsExample {
    
     public static void main(String[] args) {
      
       Vehicle car= new Car();//aslında tam bu kısımda LSP devrede!
       //yani ben bu neseneye Vehicle gibi davranacagim. Car'in ic yapisini umursamıyorum
       car.setSpeed(90);
         System.out.println("car speed:"+ car.getSpeed());
         
         Vehicle bicycle= new Car();
         //vehicle tipi uzerine yazildigi halde subclassesın ozel detaylarini bilmeden calisiyo
         bicycle.setSpeed(15);
         System.out.println("bicyle speed:"+ bicycle.getSpeed());
    }
}
