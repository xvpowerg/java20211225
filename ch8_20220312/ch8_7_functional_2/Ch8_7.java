/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220312.ch8_7_functional_2;
import ch8_20220312.ch8_6_functional_1.MyList;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class Ch8_7 {
        static MyList collectionMyList(Supplier<MyList> sup,String ... values){
            MyList myList = sup.get();
                for (String v : values){
                   myList.add(v);
                }
           return myList; 
        }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student st1 = new Student("Ken",5);
        try{
            st1.send(IllegalArgumentException::new);
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        
        MyList list = collectionMyList(MyList::new,"Lucy","Vivin","Lindy");
        list.foreach(v->System.out.println(v));
    }
    
}
