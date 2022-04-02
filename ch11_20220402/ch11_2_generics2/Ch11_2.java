/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20220402.ch11_2_generics2;
import static ch11_20220402.ch11_2_generics2.TestFunction.testMethod2;

public class Ch11_2 {

    public static void main(String[] args) {
       
        TestFunction tf1 = new TestFunction();
        int v = tf1.testMethod(10, ()->20);
        System.out.println(v);
        String msg = TestFunction.
                testMethod2("Ken", s->"Title:"+s.toLowerCase());
        System.out.println(msg);
         int v2 = testMethod2(10, r->20+r);
         //使用泛型定義回傳值為浮點數
       float f2 =   TestFunction.<Float>testMethod2(5.2f,f->f+2.5f);
       System.out.println(f2);
       
       
    }
    
}
