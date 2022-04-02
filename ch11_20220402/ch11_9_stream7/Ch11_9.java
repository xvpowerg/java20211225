/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20220402.ch11_9_stream7;
import java.util.ArrayList;
import java.util.Optional;
public class Ch11_9 {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(2);
        list.add(7);
        list.add(11);
        list.add(16);
        
       Optional<Integer> op1 = list.stream().findAny();
       Optional<Integer> op2 = list.stream().findFirst();
       op1.ifPresent(v->System.out.println("any:"+v));
       op2.ifPresent(v->System.out.println("first:"+v));
       
       op1 = list.parallelStream().findAny();
       System.out.println("any:"+op1.get());
       op2 = list.parallelStream().findFirst();
        System.out.println("first:"+op2.get());
        
        //sequential() 轉換為不是parallel
        //parallel()  轉換是parallel
        //.isParallel() 判斷是否為parallel
       op1 = list.stream().parallel().sequential().findAny();
         System.out.println("any:"+op1.get());
        System.out.println( list.stream().parallel().isParallel());
        System.out.println( list.stream().parallel().sequential().isParallel());
    }
    
}
