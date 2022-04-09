/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20220409.Ch12_5_streeam5;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch12_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Book b1 = new Book("A",100);
         Book b2 = new Book("B",50);
         Book b3 = new Book("C",25);
         Book b4 = new Book("D",18);
         Book b5 = new Book("E",72);
         Book b6 = new Book("D",25);
         Book b7 = new Book("E",56);
         Book b8 = new Book("F",27);
         
         
        ArrayList<Book> list = new ArrayList();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        list.add(b6);
        list.add(b7);
        list.add(b8);
     
        
    Map<Integer,List<Book>>  bookGroup  = list.stream().collect(Collectors.groupingBy(b->b.getPrice()/10));
    System.out.println(bookGroup);
   Map<Integer,Long> obj =  
           list.stream().collect(Collectors.groupingBy(b->b.getPrice()/10,Collectors.counting()));
   System.out.println(obj);
   
       Map<Boolean,List<Book>> bookGroup2 = 
               list.stream().collect(Collectors.partitioningBy(b->b.getPrice() >= 50));
   
       System.out.println(bookGroup2);
       
       
   Map<Integer,Map<String,List<Book>>>  bookGroup3  = 
           list.stream().collect(Collectors.groupingBy(b->b.getPrice()/10,
           Collectors.groupingBy(b->b.getName())));
    System.out.println(bookGroup3);  
    
    
       
    }
    
}
