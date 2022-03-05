/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20220305.Ch7_2_Interace_default2;

/**
 *
 * @author xvpow
 */
public class Ch7_2 {

    /**
     * @param args the command line arguments
     */
    //介面的static 方法只存在於 方法當前的介面
    //不會繼承
    public static void main(String[] args) {
        // TODO code application logic here
        MyClass myClass = new MyClass();
        myClass.defMethod();
        TestIF1.staticMethod();
    }
    
}
