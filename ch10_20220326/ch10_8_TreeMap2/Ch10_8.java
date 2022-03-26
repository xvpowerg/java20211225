/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20220326.ch10_8_TreeMap2;
import java.util.TreeMap;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch10_8 {
    private static class MyCmp implements Comparator<Item>{
            public int compare(Item i1,Item i2){
                int result = i1.getPrice() - i2.getPrice();
                if (result == 0)
                    result = i1.getName().compareTo(i2.getName());
             return   result;
            }
    }
    public static void main(String[] args) {
      //  MyCmp cmp = new MyCmp();
        //TreeMap<Item,Integer> map = new TreeMap<>(cmp);
        Comparator<Item> cmp = Comparator.comparing(it->it.getPrice());
        cmp = cmp.thenComparing(it->it.getName());
        
        
        TreeMap<Item,Integer> map = new TreeMap<>(cmp);
        Item i1 = new Item(10,"A1");
        Item i2 = new Item(5,"B2");
        Item i3 = new Item(3,"C3");
        Item i4 = new Item(10,"D4");
        Item i5 = new Item(2,"E5");
        map.put(i1, 10);
        map.put(i2, 50);
        map.put(i3, 7);
        map.put(i4, 25);
        map.put(i5, 13);
        map.forEach((k,v)->System.out.println(k+":"+v));
    }
}
