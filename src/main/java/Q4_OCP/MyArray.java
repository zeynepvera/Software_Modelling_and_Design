/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4_OCP;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WINCHESTER
 */
public class MyArray {
    
    
    public static List<Integer> filter(int[] array,IFilter filter){
        List<Integer> result= new ArrayList<>();
        
        for(int value:array ){
            if(filter.apply(value)){
                
                result.add(value);
            }
        }
        
        
        return result;
        
        
    }
    
    
}
