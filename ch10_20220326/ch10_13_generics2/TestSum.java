/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20220326.ch10_13_generics2;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class TestSum<T extends List<R>,R extends Integer> {
    
    public Integer sum(T list){
        Integer v = null;
        int ans = 0;
        for (R s : list){
            ans += s.intValue();
        }        
        return ans;
    }
}
