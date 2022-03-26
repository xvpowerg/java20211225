/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20220326.ch10_13_generics2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch10_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(70);
        TestSum<ArrayList<Integer>,Integer> sumObj = new TestSum();
        System.out.println(sumObj.sum(list));
        
    }
    
}
