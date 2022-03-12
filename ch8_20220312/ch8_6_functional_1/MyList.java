/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20220312.ch8_6_functional_1;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class MyList {
    private String[] array = new String[1000];
    private int count = 0;
    
    public String get(int index){
        return array[index];
    }
    public void add(String value){
        array[count++] = value;
    }
    public int size(){
        return count;
    }
    
    public void foreach(Consumer<String> c){
        //????
        //可以客製化輸出
        
        for(int i = 0; i < size();i++){
               String v = get(i) ;
               c.accept(v);
        }
    }
}
