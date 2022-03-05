/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20220305.Ch7_7_InnerClass1;
import java.util.function.BiConsumer;
/**
 *
 * @author xvpow
 */
public class TestInnerClass {
    //內部類可以private 
    //靜態內部類
     static class TestStaticInnerClass{
        private String msg;
      TestStaticInnerClass(String msg){
          this.msg = msg;
      }  
        public String getMsg(){
            return msg;
        } 
        
        public String toString(){
            return this.getMsg();
        }
    }
    
     class TestMyInnerClass implements BiConsumer<Integer,String>{
           public void accept(Integer i1,String s1){
               System.out.println(i1+":"+s1);
           } 
     }
     
    public void testStatic(){
        TestStaticInnerClass ts = new TestStaticInnerClass("InnerClass1");
        System.out.println(ts);
    }
    
   public void testInner(){
       BiConsumer bic = new TestMyInnerClass();
       Ch7_7.printArraysAndIndex(bic);
   }
    
}
