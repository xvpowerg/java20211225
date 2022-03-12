/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220312.ch8_8_functional_3;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.List;
import java.util.ArrayList;
public class Ch8_8 {

   static List<Integer> mapStringToLenList(Function<String,Integer>f,
           Supplier<List<Integer>> supList,String ... values){
       List<Integer> list = supList.get();
       for (String n : values){
           list.add(f.apply(n));
       }
       return list;
   }
    public static void main(String[] args) {
        
        List<Integer> list = mapStringToLenList(s->s.length(),
                ()->new ArrayList(),"Ken","Iris","Lucy","Vivin");
        list.forEach(i->System.out.println(i));
        //使用Method  Reference
    }
    
}
