/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20220305.Ch7_7_InnerClass1;
import java.util.function.BiConsumer;
/**
 *
 * @author xvpow
 */
public class Ch7_7 {
    
    
    public static void printArraysAndIndex(BiConsumer<Integer,String> bic){
        String[] array = {"Ken","Vivin","Lindy","Joy","Iris"};
        for (int i = 0;i < array.length;i++){
            bic.accept(i, array[i]);            
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        TestInnerClass tis = new TestInnerClass();
        tis.testStatic();
        TestInnerClass.TestStaticInnerClass tis2 = 
                new TestInnerClass.TestStaticInnerClass("St Inner2");
        System.out.println(tis2);
        
        tis.testInner();
       TestInnerClass.TestMyInnerClass minc = tis.new TestMyInnerClass();
       printArraysAndIndex(minc);
       
       
    }
    
}
