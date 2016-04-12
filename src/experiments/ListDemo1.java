/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiments;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nparbs
 */
public class ListDemo1 {
    public static void main(String[] args) {
        List<String> shoppingCart = new ArrayList<>();
        shoppingCart.add("Beer");
        shoppingCart.add("Chips");
        shoppingCart.add("Beer");
        shoppingCart.add("Pizza");
;
        
        String item = shoppingCart.get(1);
        shoppingCart.add(1,"Cheese");
        
        
        
        
        for(int i=0;i < shoppingCart.size(); i++){
            
            System.out.println(shoppingCart.get(i));
        }
        
        for(String s : shoppingCart){
            System.out.println(s);
        }
        
        System.out.println(shoppingCart.size());
        
    }
    
}
