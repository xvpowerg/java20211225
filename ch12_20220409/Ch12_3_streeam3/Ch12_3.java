/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20220409.Ch12_3_streeam3;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch12_3 {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<String> names = new ArrayList();
      
        names.add("ken");
        names.add("vivin");
        names.add("lucy");
        names.add("joy");
        names.add("iris");
        names.stream().filter(n->n.length() > 3).forEach(v->System.out.println(v));
          
      List<String>   newNameList = 
              names.stream().filter(n->n.length() > 3).collect(Collectors.toList());
       System.out.println(newNameList);
       
      ArrayList<String> nameList2 = 
              names.stream().map(String::toUpperCase).collect(Collectors.toCollection(ArrayList::new));
      System.out.println(nameList2);
       //幫我生成一組List 內容是 大寫的姓名
       
        List<Integer> values = new ArrayList();
        values.add(52);
        values.add(74);
        values.add(15);
        values.add(6);
        values.add(3);
        TreeSet<Integer> treeSet = 
                values.stream().collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeSet);
        
        
    }
    
}
