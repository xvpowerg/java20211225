/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20220409.Ch12_1_streeam1;
import java.util.List;
import java.util.ArrayList;
public class Ch12_1 {

    public static void main(String[] args) {
        Book b1 = new Book("A",100);
        Book b2 = new Book("B",150);
        Book b3 = new Book("C",50);
        Book b4 = new Book("D",75);
        Book b5 = new Book("E",82);
        
        
        Book b6 = new Book("F",81);
        Book b7 = new Book("G",95);
        Book b8 = new Book("H",71);
        
            Student st1 = new Student();
            st1.append(b1);
            st1.append(b2);
            st1.append(b3);
            st1.append(b4);
            st1.append(b5);
            
            Student st2 = new Student();
            st2.append(b6);
            st2.append(b7);
            st2.append(b8);
        List<Student> stList = new ArrayList();
        stList.add(st1);
        stList.add(st2);
        
//        for (Student st :stList ){
//            st.getBooks().clear();
//           for (Book b :st.getBooks() ){
//               System.out.print(b+" ");
//           }
//           System.out.println();
//        }

//        for (Student st :stList ){
//           st.getBookStream().forEach(v->System.out.print(v+" "));           
//           System.out.println();
//        }

    stList.stream().map(st->st.getBookStream()).
     forEach(bst->bst.forEach(bok->System.out.println(bok)));
    System.out.println("==================================");
    stList.stream().flatMap(st->st.getBookStream()).forEach(b->System.out.println(b));
     
    }
    
}
