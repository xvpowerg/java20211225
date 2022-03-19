/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220319.Ch9_8_TreeSet1;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch9_8 {

    
    private static class MyComparator implements Comparator<Integer>{
        //v1 大於 v2 回傳正數
        //v1 小於 v2 回傳負數
        //v1與v2相同回傳0
        public int compare(Integer v1,Integer v2){
            if (v1 > v2){
                return -1;
            }else if(v1 < v2){
                return 1;
            }
            return 0;
        }
    }
  
    public static void main(String[] args) {
        MyComparator myComp = new MyComparator();
       TreeSet<Integer> treeSet = new TreeSet<>(myComp);
        treeSet.add(100);
        treeSet.add(80);
        treeSet.add(60);
        treeSet.add(50);
        treeSet.add(70); 
        treeSet.forEach(v->System.out.println(v));
    }
    
}
