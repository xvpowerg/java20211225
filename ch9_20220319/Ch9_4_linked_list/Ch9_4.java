/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220319.Ch9_4_linked_list;
import ch9_20220319.Ch9_2_list_method.Ch9_2;
import java.util.List;
import java.util.LinkedList;
/**
 *
 * @author xvpow
 */
public class Ch9_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LinkedList<String> list = new LinkedList();
       LinkedList<String> emptyList = new LinkedList(); 
       list.add("Ken");
       list.add("Vivin");
       list.add("Lindy");
       list.add("Lucy");
       Ch9_2.printList(list);
       list.addFirst("F1");
       list.addLast("E5");
       Ch9_2.printList(list);
       
       String v1 = list.element();
       Ch9_2.printList(list);
       System.out.println("element1:"+v1);
        v1 = list.element();
        System.out.println("element2:"+v1);        
       v1 =  list.peek();
       System.out.println("peek1:"+v1);    
        v1 =  list.peek();
       System.out.println("peek2:"+v1);       
       //System.out.println(emptyList.element());//java.util.NoSuchElementException
       System.out.println(emptyList.peek());
       
       v1 = list.poll();
       System.out.println(v1);
        Ch9_2.printList(list);
        v1 = list.poll();
         System.out.println(v1);
    }
    
}
