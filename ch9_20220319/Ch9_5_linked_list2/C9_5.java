/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220319.Ch9_5_linked_list2;
import java.util.LinkedList;
/**
 *
 * @author xvpow
 */
public class C9_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     LinkedList<Integer> list = new LinkedList();
     list.add(10);
     list.add(5);
     list.add(3);
     list.add(9);
//     Integer v1 = list.poll();
//     while(v1!=null){
//         System.out.print(v1+" ");
//         v1 = list.poll();
//     }
//     System.out.println();
        
        Integer v1 = null;
        while( (v1 =list.poll())!=null   ){
           System.out.print(v1+" ");
        }
        System.out.println();
     //list.poll()
     //while 
     // 顯示 10 5 3 9
    }
    
}
