/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20220402.ch11_3_stream1;
import java.util.ArrayList;
public class Ch11_3 {
    public static void main(String[] args) {
     
        ArrayList<Integer> list = new ArrayList();
        list.add(-10);
        list.add(8);
        list.add(7);
        list.add(-2);
        list.add(-9);
        list.add(5);
      
        for(int i = 0; i < list.size();i++){
            int v = list.get(i);
            if (v < 0) continue;

            System.out.println(v);
        }
        
        System.out.println("======================================");
        list.stream().filter(v->v>=0).forEach(v->System.out.println(v));
        
    }
    
}
