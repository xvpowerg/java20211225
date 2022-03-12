/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220312.ch8_2_lambda3;

/**
 *
 * @author xvpow
 */
public class Ch8_2 {
    private String value1;
    public void setValue1(String v1){
        this.value1 = v1;
    }
    private void testMethod(String msg){
        System.out.println("Ch8_2 testMethod:"+this.value1 +":"+msg);
    }
    private void testLabdmaMR(String msg){
    TestIF2 t2 = this::testMethod;
    t2.test2(msg);
    }
    public static void main(String[] args) {        
                 //因為只有一個參數所以可不加()
        TestIF2  t2_3 =  m->{         
                   System.out.println("Lambda t2_3:"+m);
        };
        t2_3.test2("t2_3 Hello");        
        TestIF2  t2_4 =  m->  System.out.println("Lambda t2_4:"+m);
        t2_4.test2("t2_4_hello");        
        TestIF2  t2_5 =  (m)->  System.out.println("Lambda t2_5:"+m);
        t2_5.test2("T2_5 Hello");    
        
        Ch8_2 vh82 = new Ch8_2();
        vh82.setValue1("Main Ch8_2 Hello!");         
        TestIF2  t2_6 = vh82::testMethod;
         t2_6.test2("testMethod Msg!!");
        //呼叫Method Refrcnce 的方法是在非靜態方法時    
        vh82.testLabdmaMR("testMethod2 Msg");
        // TODO code application logic here
        TestIF2  t2_1 =  new TestIF2(){
            public void test2(String v){
                    System.out.println("內部類 t2_1:"+v);
            }
        };
        
        t2_1.test2("內部類測試!");
         TestIF2  t2_2 = (String m)->{
         System.out.println("Lambda T2_2:"+m);
         };
         t2_2.test2("測試Lambda t2_2");

    }
    
}
