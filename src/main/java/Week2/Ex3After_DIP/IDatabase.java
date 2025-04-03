/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.Ex3After_DIP;

/**
 *
 * @author WINCHESTER
 */
interface IDatabase {
     /*Yüksek seviyeli sınıflar (OrderService),
düşük seviyeli sınıflara (MySQLDatabase) bağımlı olmamalı.
Her ikisi de bir soyutlamaya (interface'e) bağlı olmalı.*/

    public void saveOrder(String order);

}
