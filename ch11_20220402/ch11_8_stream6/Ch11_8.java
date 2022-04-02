/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20220402.ch11_8_stream6;
import java.util.Optional;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch11_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Optional<String> op1 = Optional.of("Ken");
        String v = op1.get();
        System.out.println(v);
        //Optional.of 不支持null
       //Optional<String> op2 = Optional.of(null);
       Optional<String> op3 = Optional.ofNullable(null);
       //op3.get();//因為內容為null所以不能get
      // op3 = Optional.ofNullable("Vivin");
      //isPresent 內容不是null回傳true
       if (op3.isPresent()){
            System.out.println(op3.get());
       }
      
      op3.ifPresent(n->System.out.println("n:"+n));
      
      op3.ifPresentOrElse(n->System.out.println("ifPresentOrElse n:"+n), 
                         ()->System.out.println("ifPresentOrElse Empty"));
      
      
     Optional<String> op4 = Optional.ofNullable(null);   
     String result1 =   op4.orElse("empty");
     System.out.println("result1:"+result1);
     String result2 =op4.orElseGet(()->new Random().nextInt(1000)+" Empty");
      System.out.println("result2:"+result2);
      String result3 =op4.orElseThrow(()->new IllegalArgumentException("不可空白"));
            System.out.println("result3:"+result3);
    }
    
}
