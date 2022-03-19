/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220319.Ch9_11_TreeSet4;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch9_11 {
        
    private static class MyComparator implements Comparator<Student>{
            public int compare(Student st1,Student st2){
                 int cmp = st1.getScore1()  - st2.getScore1();
                 
                 if (cmp != 0) return cmp;
                            
                cmp = st1.getScore2()  - st2.getScore2();
                if (cmp != 0) return cmp;
            
                return st1.getName().compareTo(st2.getName());
            }
    }
    
    public static void main(String[] args) {
        MyComparator cmp = new MyComparator();
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
