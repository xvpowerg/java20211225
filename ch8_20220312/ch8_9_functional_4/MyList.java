/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20220312.ch8_9_functional_4;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
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
    
    public void toUpCase(UnaryOperator<String> u){
        for (int i = 0; i < size();i++){
            String v =   u.apply(get(i));
            array[i] = v;
        }
    }
}
