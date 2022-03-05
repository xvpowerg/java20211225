/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20220305.Ch7_6_Interface_functional;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class TestConsumer  implements Consumer<String> {
    public void accept(String st){
        System.out.println("TestConsumer:"+st);
    }
}
