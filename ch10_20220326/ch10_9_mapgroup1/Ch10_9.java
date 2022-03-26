/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20220326.ch10_9_mapgroup1;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch10_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item i1 = new Item(20,"A1");
        Item i2 = new Item(35,"B2");
        Item i3 = new Item(33,"C3");
        Item i4 = new Item(26,"D4");
        Item i5 = new Item(32,"E5");
        Item i6 = new Item(22,"E5");
        Item i7 = new Item(12,"F6");
        Item i8 = new Item(13,"G7");
        ArrayList<Item> list = new ArrayList();
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        list.add(i5);
        list.add(i6);
        list.add(i7);
        list.add(i8);
        HashMap<Integer,List<Item>> group = new HashMap();
        //10x一組  2x一組  3x一組
        for(Item it : list){
            List<Item> values = new ArrayList<>();
            int key = it.getPrice()/10;
            if (group.containsKey(key)){
               values =  group.get(key);
            }
            values.add(it);
            group.put(key, values);
        }
        
        group.forEach((k,v)->System.out.println(k+":"+v));
    }
    
}
