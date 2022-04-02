/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20220402.ch11_2_generics2;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class TestFunction {
    public <T> T testMethod(T t,Supplier<T> su){
        T reustl = su.get();
        return reustl;
    } 
    
    public static <T> T testMethod2(T t,
            UnaryOperator<T> uop){
        T result  = uop.apply(t);
        return result;
    } 
    
}
