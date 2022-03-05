/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch7_20220305.Ch7_1_Interace_default1;

/**
 *
 * @author xvpow
 */
public interface MyIterator {
    String getValue();
    boolean hasNext();
    
    default void foreach(){
        while(hasNext()){
            System.out.println(getValue());
        }
    }
}
