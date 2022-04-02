/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20220402.ch11_4_stream2;
import java.util.stream.Stream;
import java.util.ArrayList;
public class Ch11_4 {
    public static void main(String[] args) {
        // 1 Steam不可重複使用
        // 2 Steam不會改變來源
        // 3 Steam分為lazy 與 terminal 
        Stream<String> st1 = Stream.of("Ken","Vivin","Lucy","Joy");
        
        long count = st1.count();
        System.out.println(count);
        System.out.println("===================");
        //Steam不可重複使用
        //st1.forEach(v->System.out.println(v));//出錯因為重複使用
        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(5);
        list.add(7);
        list.add(3);
        list.stream().filter(v->v>5).forEach(v->System.out.println(v));
        System.out.println(list);
        System.out.println("===================");
        //filter 為lazy
        list.stream().peek(v->System.out.println("Peek:"+v)).filter(v->v> 3);
        //count為terminal
        long count2 =
                list.stream().peek(v->System.out.println("Peek:"+v)).filter(v->v>3).count();
    }
    
}
