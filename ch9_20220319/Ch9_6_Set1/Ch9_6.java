/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220319.Ch9_6_Set1;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class Ch9_6 {

    public static void main(String[] args) {
      Set<Integer> set1 = new HashSet<>();  
      set1.add(10);
      set1.add(50);
      set1.add(20);
      set1.add(5);
      set1.add(20);
      set1.add(7);
      set1.forEach(v->System.out.println(v));
      System.out.println(set1.contains(5));
      List<Integer> setToList = new ArrayList(set1);
      System.out.println(setToList);
      Set hashSet = new HashSet(setToList);
      hashSet.forEach(v->System.out.print(v+" "));
         System.out.println();
    }
    
}
