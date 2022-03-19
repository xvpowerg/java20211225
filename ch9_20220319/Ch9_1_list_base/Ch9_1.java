/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220319.Ch9_1_list_base;
import java.util.ArrayList;
import java.util.List;
public class Ch9_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List<String> list = new ArrayList<>();
       list.add("Ken");
       list.add("Vivin");
       list.add("Lucy");
       list.add("Lindy");
       list.forEach(v->System.out.println(v));
              
       
    }
    
}
