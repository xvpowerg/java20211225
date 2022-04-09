/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20220409.Ch12_4_streeam4;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch12_4 {

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
         
        ArrayList<Book> list = new ArrayList();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        list.add(b6);
//key不重複可用        
//      Map<String,Book>  bookMap = 
//              list.stream().
//                      collect(Collectors.toMap(b->b.getName(),
//                              b->b));
//        System.out.println(bookMap);

HashMap<String,List<Book>> bookMap2 = list.stream().collect(
        Collectors.toMap(b->b.getName(), b->{
        List<Book> bookList = new ArrayList();
        bookList.add(b);
        return bookList;
        }, (ov,nv)->{
            ov.addAll(nv);
            return ov;},HashMap::new));

System.out.println(bookMap2);
    }
    
}
