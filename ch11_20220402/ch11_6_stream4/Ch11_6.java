/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20220402.ch11_6_stream4;
import java.util.stream.Stream;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch11_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(5);
       list.add(1);
       list.add(7);
       list.add(2);
       list.add(3);
       //全都成立回傳true
       boolean b1 =   list.stream().allMatch(v->v > 0);
       System.out.println(b1);
       //只要一組成立回傳true
       boolean b2 = list.stream().anyMatch(v -> v> 6);
       System.out.println(b2);
       //全都不成立回傳true
       boolean b3 = list.stream().noneMatch(v-> v < 0);
       System.out.println(b3);
        System.out.println("================================");
       //只要一個不成立短路
       boolean b4 = list.stream().peek(v->System.out.println("peek:"+v)).allMatch(v->{
           System.out.println(v);
           return v > 4; 
       });
       System.out.println(b4);
       //只要一組成立短路
      boolean b5 =  list.stream().anyMatch(v->{
           System.out.println("anyMatch:"+v);
           return v > 6;});
       //只要一組成立短路
      boolean b6 =  list.stream().noneMatch(v->{
        System.out.println("noneMatch:"+v);
        return v > 6;
        });
      
      System.out.println(b5+":"+b6);
      
      list.stream().skip(3).forEach(v->System.out.println(v));
       
    }
    
}

