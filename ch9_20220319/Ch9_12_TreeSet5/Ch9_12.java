/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220319.Ch9_12_TreeSet5;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch9_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //幫我
      Comparator<Student> cmp =   (cst1,cst2)->{
          if (cst1.getScore1() - cst2.getScore1() != 0){
              return cst1.getScore1() - cst2.getScore1();
          }else if(cst1.getScore2() - cst2.getScore2() != 0){
              return cst1.getScore2() - cst2.getScore2();
          }          
          return cst1.getName().compareTo( cst2.getName());
      };
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
