/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20220402.ch11_5_stream3;
import java.util.stream.IntStream;
import java.util.function.IntSupplier;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch11_5 {

    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
         IntStream s1 =  IntStream.generate(()->random.nextInt(500)).limit(5);
         //long count = s1.count();
         //System.out.println(count);
         s1.forEach(i->System.out.println(i));
         
         IntStream s2 = IntStream.iterate(1,v->v+2).limit(10);
         s2.forEach(v->System.out.println(v));
    }
    
}
