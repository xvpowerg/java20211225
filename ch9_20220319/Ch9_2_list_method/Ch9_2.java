/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220319.Ch9_2_list_method;
import java.util.List;
import java.util.ArrayList;
public class Ch9_2 {
    
    public static<T>  void printList(List<T> list){
        for (T v : list){
           System.out.print(v+" ");
        }
          System.out.println();
        System.out.println("============================");
    }
    public static void main(String[] args) {
    
        List<Integer> list = new ArrayList();
        list.add(10);
        list.add(50);
        list.add(3);
        list.add(6);
        list.add(7);
        printList(list);
        
        list.add(2, 9);
          printList(list);
        List<Integer> list2 = new ArrayList();
        list2.add(200);
        list2.add(500);
        list2.add(750);
        list.addAll(list2);
         printList(list);
        List<Integer> list3 = new ArrayList();
        list3.add(66);
        list3.add(99);
        list3.add(77);
        list.addAll(4, list3);
        printList(list);
        
        boolean b1 = list.contains(500);
        System.out.println(b1);
        boolean b2 = list.contains(900);
        System.out.println(b2);        
        boolean b3 =  list.containsAll(list2);
        System.out.println(b3);
        
        list.remove(Integer.valueOf(99));
        printList(list);   
        
        List<Integer> deleteList = new ArrayList();
        deleteList.add(200);
        deleteList.add(500);
        list.removeAll(deleteList);
        printList(list);   
        
        list.replaceAll(v->v+10);
        printList(list);   
        int index = list.indexOf(50);//找不到-1 找到回傳index
        System.out.println(index);
    }
    
}


