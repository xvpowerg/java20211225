/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220319.Ch9_10_TreeSet3;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch9_10 {

    public static void main(String[] args) {
       TreeSet <Student> tree = new TreeSet<>();
       Student st1 = new Student("Ken",100,80);
       Student st2 = new Student("Iris",70,80);
       Student st3 = new Student("Vivin",100,90);
       Student st4 = new Student("Lucy",100,80);
       Student st5 = new Student("Lucy",100,80);
        tree.add(st1);
        tree.add(st2);
        tree.add(st3);
        tree.add(st4);
        tree.add(st5);
       tree.forEach(v->System.out.println(v));
        
    }
    
}
