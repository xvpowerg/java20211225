/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220319.Ch9_9_TreeSet2;
import java.util.TreeSet;
public class Ch9_9 {

    //數字 < 大寫字母 < 小寫字母
    
    public static void main(String[] args) {
        // TODO code application logic here
        TreeSet<String> treeSet = new TreeSet();
        treeSet.add("Iris");
        treeSet.add("Vivin");        
        treeSet.add("Anita");
        treeSet.add("Ken");
        treeSet.add("Lucy");
       treeSet.forEach(v->System.out.println(v));
    }
    
}
