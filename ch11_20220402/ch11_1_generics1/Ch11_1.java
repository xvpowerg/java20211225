/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20220402.ch11_1_generics1;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch11_1 {
        static void printList(List<Test1> list){
            list.forEach(System.out::println);
        }
        //? extends 不可新增
        //? extends 可顯示
        static void printList2(List<? extends Test1> list){
            for(Test1 v : list){
                System.out.println(v);
            }
        }
        //? super  父類 或自己
        //
         static void printList3(List<? super Test2> list){
             //取出類型是Object
             //可新增但類型必須是子類或一樣
             list.add(new Test2());             
             Object t1  = list.get(1);
            for(Object v : list){
                System.out.println(v);
            }
        }
    public static void main(String[] args) {
          
        Test1 t1 = new Test3();
        List<Test1> myList = new ArrayList<>();
        myList.add(new Test3());
        myList.add(new Test2());
        ArrayList<Test3> lis2 = new ArrayList<>();
        //一般generice 無多型效果
        printList(myList );
        //printList(lis2 );//錯誤一般generice 無多型效果
        
       ArrayList<Test2> lis3 = new ArrayList<>(); 
        lis3.add(new Test2());
        lis3.add(new Test2());
        lis3.add(new Test3());
        printList2(lis3);
        
        System.out.println("===============================");
       ArrayList<Test1> lis4 = new ArrayList<>();  
       lis4.add(new Test2());
       lis4.add(new Test1());
       lis4.add(new Test3());
       printList3(lis4);
    }
    
}
