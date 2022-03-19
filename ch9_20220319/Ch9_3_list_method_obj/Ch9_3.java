/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220319.Ch9_3_list_method_obj;
import ch9_20220319.Ch9_2_list_method.Ch9_2;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch9_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Item i1 = new Item("A",100);
        Item i2 = new Item("B",200);
        Item i3 = new Item("C",300);
        Item i4 = new Item("D",600);
        Item i5 = new Item("D",600);
        //
       System.out.println(i5.equals(i4));
        //1 幫我在List 限定只可加入Item
        //2 呼叫printList 輸出 Item的 name 與 price
        List<Item> list = new ArrayList<>();
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        list.remove(i5);
        Ch9_2.printList(list);
    }
    
}
