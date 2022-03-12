/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20220312.ch8_6_functional_1;
import java.util.function.Consumer;
public class Ch8_6 {
    
    public static void main(String[] args){
        MyList list = new MyList();
        list.add("Ken");
        list.add("Vivin");
        list.add("Lindy");
//        for (int i = 0; i < list.size();i++){
//            System.out.println(list.get(i));
//        }
        list.foreach(new Consumer<String>(){
               public void accept(String s){
                   System.out.println("v:"+s);
               }     
        });
        
       list.foreach(System.out::println);
       list.foreach(v->System.out.println("v3:"+v));
    }
}
