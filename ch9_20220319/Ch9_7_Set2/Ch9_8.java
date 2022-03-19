/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220319.Ch9_7_Set2;

import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author xvpow
 */
public class Ch9_8 {

    public static void main(String[] args) {
        Student st1 = new Student("Vivin", 82, 95);
        Student st2 = new Student("Lucy", 74, 66);
        Student st3 = new Student("Iris", 67, 91);
        Student st4 = new Student("Joy", 54, 81);
        Student st5 = new Student("Joy", 54, 81);
        Set<Student> hashSet = new HashSet();
        System.out.println(st5.equals(st4));
        
        hashSet.add(st1);
        hashSet.add(st2);
        hashSet.add(st3);
        hashSet.add(st4);
        hashSet.add(st5);
        
        hashSet.forEach(st->System.out.println(st));
    }

}
