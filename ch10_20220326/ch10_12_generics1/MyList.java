/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20220326.ch10_12_generics1;
import java.util.ArrayList;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class MyList<T> {
    private ArrayList<T> data = new ArrayList();
    public T get(int index){
        return data.get(index);
    }
    
    public void add(T value){        
        data.add(value);
    }
    
    public void foeach(Consumer<T> consumer){
        data.forEach(consumer);
    }
}
