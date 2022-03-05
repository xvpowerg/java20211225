/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20220305.Ch7_6_Interface_functional;
import java.util.Arrays;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public class Ch7_6 {

    public static void main(String[] args) {
       
        String[] data = {"Ken","Vivin","Lucy","Joy"};
        TestConsumer tc = new TestConsumer();
        Arrays.stream(data).forEach(tc);
       Supplier<String> sp1 = new TestSupplier();
       System.out.println(sp1.get());
        Function<String,Integer> f1 = new TestFunctional();
        int len =  f1.apply("abcde");
        System.out.println(len);
        UnaryOperator<Integer> uo = new TestUnaryOperator();
        System.out.println(uo.apply(31));  
        Predicate<Integer> p1 = new TestPredicate();
         System.out.println(p1.test(30));  
         System.out.println(p1.test(15));  
    }
    
}
