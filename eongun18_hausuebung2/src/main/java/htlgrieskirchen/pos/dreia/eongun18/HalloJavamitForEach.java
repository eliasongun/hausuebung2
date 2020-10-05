/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htlgrieskirchen.pos.dreia.eongun18;


import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.Consumer;

/**
 *
 * @author eongu
 */
public class HalloJavamitForEach {
    
    List<String> list = new ArrayList<String>();
    
    public void forEach()
    {
        for (String s : list) {
            System.out.println(s);
            
        }
            
        
      list.forEach((String s) -> System.out.println(s));
      
      Consumer<String> consumer = (String s) -> System.out.println(s);
      
      list.forEach(System.out::print);
        
      
    }
    
}
