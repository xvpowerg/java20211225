/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20220305.Ch7_1_Interace_default1;

/**
 *
 * @author xvpow
 */
public class Ch7_1 {
//MyList 可傳入 可以將MyList的內容全數輸出
   static void foreach(MyList list){
        for (int i = 0;i <list.getSize() ;i++){
             System.out.println(list.get(i));
        }
   }
   
   static void foreach(MyIterator it){
        while(it.hasNext()){
            System.out.println(it.getValue());
          }
   }
    public static void main(String[] args) {
        // TODO code application logic here
        MyList list = new MyList();
        list.add("Ken");
        list.add("Vivin");
        list.add("Lucy");
        list.add("Iris");
        list.add("Joy");
        
        MyList2 mylist2 = new MyList2();
        mylist2.add("A");
        mylist2.add("B");
        mylist2.add("C");
        mylist2.add("D");
 System.out.println("=======================");
//      MyIterator it = list;
//      while(it.hasNext()){
//          System.out.println(it.getValue());
//      }
    foreach(list);
     foreach(mylist2);
        //超過最大長度拋出以下例外
        //new ArrayIndexOutOfBoundsException()
        //System.out.println(list.get(3));
//        for (int i = 0;i <list.getSize() ;i++){
//             System.out.println(list.get(i));
//        }
        //foreach(list);
      //  foreach(mylist2);
      //MyIterator Foreach
 
    }
    
}

