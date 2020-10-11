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
    List<String> list = new ArrayList<>();
    
    public HalloJavamitForEach() {
        list.add("A");
        list.add("B");
        list.add("C");
    }
    
    public void printList(){ 
        for(String s: this.list){
            System.out.println(s);
        }
        System.out.println("______________________________________");
    }
    
    public void printList2(){
        this.list.forEach((String s) -> System.out.println(s));
        System.out.println("______________________________________");
    }
    
    public void printList3(){
        Consumer<String> consumer = (String s) -> System.out.println(s);
        this.list.forEach(consumer);
        System.out.println("______________________________________");
    }
    
    public void printList4(){
        list.forEach(System.out::println);
        System.out.println("______________________________________");
    }
    
}
