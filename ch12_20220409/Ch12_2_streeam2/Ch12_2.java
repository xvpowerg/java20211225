/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20220409.Ch12_2_streeam2;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 *
 * @author xvpow
 */
public class Ch12_2 {

    public static void main(String[] args) {
       
        List<Integer> data = new ArrayList<>();
        data.add(10);
        data.add(2);
        data.add(7);
        data.add(13);
        data.add(15);
      Optional<Integer> op =   
       data.stream().reduce((v1,v2)->{
           System.out.println(v1+":"+v2);
           return v1+v2;});
           
      System.out.println(op.get());
         System.out.println("======================================");
     int ans =  data.stream().reduce(6, (v1,v2)->{
      System.out.println(v1+":"+v2);
      return v1+v2;
      });
     System.out.println(ans);
     
     System.out.println("===========================");
     int ans2 = data.stream().parallel().reduce(6, (v1,v2)->{
        System.out.println(v1+":"+v2);
        return v1 + v2;
     }, (v1,v2)->{
         System.out.println("c:"+v1+":"+v2);
     return v1+ v2;
     });
    
       System.out.println("ans2:"+ans2);
    }
    
}
