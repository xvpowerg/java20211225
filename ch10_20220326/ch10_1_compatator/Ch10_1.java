/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20220326.ch10_1_compatator;

import java.util.TreeSet;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author xvpow
 */
public class Ch10_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int type = scan.nextInt();
          //幫我輸入1 由小到大排序
        //幫我輸入2 由大到小排序
        
        Comparator<Student> cmp = Comparator.comparing(st->st.getScore1());
        cmp = cmp.thenComparing(st->st.getScore2()).
                  thenComparing(st->st.getName());
        if (type == 2){
           cmp = cmp.reversed();
        }
       TreeSet <Student> tree = new TreeSet<>(cmp);
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
